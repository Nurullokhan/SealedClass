sealed class Color {
    class Red : Color() {
        fun show() {
            println("Red light is on")
        }
    }

    class Yellow : Color() {
        fun show() {
            println("Yellow light is on")
        }
    }

    class Green : Color() {
        fun show() {
            println("Green light is on")
        }
    }
}
