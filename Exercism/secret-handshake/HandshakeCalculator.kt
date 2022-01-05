object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val list = mutableListOf<Signal>()
        val binary = number.toString(2).reversed()

        for(i in binary.indices) {
            if(binary[i] == '1') {
                when(i) {
                    0 -> list.add(Signal.WINK)
                    1 -> list.add(Signal.DOUBLE_BLINK)
                    2 -> list.add(Signal.CLOSE_YOUR_EYES)
                    3 -> list.add(Signal.JUMP)
                    4 -> list.reverse()
                }
            }
        }
        return list
    }
}
