fun isnum(chr: Char): Boolean {
    for (fc in "1234567890. ")
    {
        if (fc == chr)
        {
            return true;
        }
    }
    return false;
}

fun main(args: Array<String>) {
    print("Введите пример: ");
    val str:String = readln();
    var n1:String = "";
    var n2:String = "";
    var oper:Char = 's';
    var j:Int = 0;

    for (i in str.indices)
    {
        if (isnum(str[i]))
        {
            n1 += str[i];
        } else { j = i; break;}

    }

    for (i in j until str.length)
    {
        if (!isnum(str[i]))
        {
            oper = str[i]
        } else {j = i; break;}

    }

    for (i in j until str.length)
    {
        if (isnum(str[i]))
        {
            n2 += str[i];
        } else {j = i; break;}

    }

    when(oper)
    {
        '+' -> println("$n1 + $n2 = " + (n1.toDouble() + n2.toDouble()));
        '-' -> println("$n1 - $n2 = " + (n1.toDouble() - n2.toDouble()));
        '*' -> println("$n1 * $n2 = " + (n1.toDouble() * n2.toDouble()));
        '/' -> println("$n1 / $n2 = " + (n1.toDouble() / n2.toDouble()));
    else -> {println("Действие неверно")}
    }
}