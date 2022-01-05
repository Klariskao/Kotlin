object ResistorColorTrio {

    fun text(vararg input: Color): String {
        var output = ""
        for(i in input.indices) {
            if(i < 2) {
                output += when(input[i]) {
                    Color.BLACK -> 0
                    Color.BROWN -> 1
                    Color.RED -> 2
                    Color.ORANGE -> 3
                    Color.YELLOW -> 4
                    Color.GREEN -> 5
                    Color.BLUE -> 6
                    Color.VIOLET -> 7
                    Color.GREY -> 8
                    Color.WHITE -> 9
                }
            }
            else {
                if(output.toInt() % 10 == 0) {
                    output = output.subSequence(0, 1).toString()
                    output += when(input[i]) {
                        Color.BLACK -> "0 " + Unit.OHMS
                        Color.BROWN -> "00 " + Unit.OHMS
                        Color.RED -> " " + Unit.KILOOHMS
                        Color.ORANGE -> "0 " + Unit.KILOOHMS
                        Color.YELLOW -> "00 " + Unit.KILOOHMS
                        Color.GREEN -> " " + Unit.MEGAOHMS
                        Color.BLUE -> "0 " + Unit.MEGAOHMS
                        Color.VIOLET -> "00 " + Unit.MEGAOHMS
                        Color.GREY -> " " + Unit.GIGAOHMS
                        Color.WHITE -> "0 " + Unit.GIGAOHMS
                    }
                }
                else {
                    output += when(input[i]) {
                        Color.BLACK -> " " + Unit.OHMS
                        Color.BROWN -> "0 " + Unit.OHMS
                        Color.RED -> "00 " + Unit.OHMS
                        Color.ORANGE -> " " + Unit.KILOOHMS
                        Color.YELLOW -> "0 " + Unit.KILOOHMS
                        Color.GREEN -> "00 " + Unit.KILOOHMS
                        Color.BLUE -> " " + Unit.MEGAOHMS
                        Color.VIOLET -> "0 " + Unit.MEGAOHMS
                        Color.GREY -> "00 " + Unit.MEGAOHMS
                        Color.WHITE -> " " + Unit.GIGAOHMS
                    }
                }
            }
        }
        return output.toLowerCase()
    }
}
