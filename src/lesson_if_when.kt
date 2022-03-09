fun ifExpression1(variable: Any): Boolean {
    if (variable is String) {
        return true
    } else {
        return false
    }
}

fun ifExpression2(variable: Any) =
    if (variable is String) {
        true
    } else {
        false
    }

fun ifExpression3(variable: Any) = if (variable is String) 1 else 0

fun ifExpression4(variable: Any) = variable is String


fun checker(ch: Char) = when (ch) {
    in 'a'..'z', in 'A'..'Z' -> "It is letter"
    in '0'..'9' -> "It is digit"
    else -> "Unknown symbol"
}


fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }


// when առանց արգումենտի
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) ->
            Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                (c1 == Color.BLUE && c2 == Color.YELLOW) ->
            Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
                (c1 == Color.VIOLET && c2 == Color.BLUE) ->
            Color.INDIGO
        else -> throw Exception("Dirty color")
    }

fun nullAbelFunction(color: Color): String? =
    when (color) {
        Color.RED, Color.ORANGE -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO -> "cold"
        else -> null
    }
