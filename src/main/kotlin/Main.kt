fun main(args: Array<String>) {

    val color = Color.Red()
    check(color)

}

fun check(color: Color) {
    when (color) {
        is Color.Red -> Color.Red().show()
        is Color.Yellow -> Color.Yellow().show()
        is Color.Green -> Color.Green().show()
    }
}