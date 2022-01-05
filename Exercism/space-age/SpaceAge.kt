class SpaceAge(private val i: Int) {

    fun onEarth(): Double = "%.2f".format(i / 31557600.0).toDouble()
    fun onMercury(): Double = "%.2f".format(i / (31557600.0 * 0.2408467)).toDouble()
    fun onVenus(): Double = "%.2f".format(i / (31557600.0 * 0.61519726)).toDouble()
    fun onMars(): Double = "%.2f".format(i / (31557600.0 * 1.8808158)).toDouble()
    fun onJupiter(): Double = "%.2f".format(i / (31557600.0 * 11.862615)).toDouble()
    fun onSaturn(): Double = "%.2f".format(i / (31557600.0 * 29.447498)).toDouble()
    fun onUranus(): Double = "%.2f".format(i / (31557600.0 * 84.016846)).toDouble()
    fun onNeptune(): Double = "%.2f".format(i / (31557600.0 * 164.79132)).toDouble()
}