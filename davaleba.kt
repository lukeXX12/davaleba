fun main() {

    // პოინტი
    var p1 = Point(x = 15.0, y = 23.0)
    var p2 = Point(x = 17.0, y = 26.0)
    val iqsisken = iqsi(Y = p1.y, Z = 3.0)
    println(iqsisken)
    val igrekisken = igreki(X = p2.x, Z= 7.0)
    println(igrekisken)








//წილადების პრინტები


    println(usg(a = 20.0, b = 43.0))
    var f1 = Fraction()
    f1.numerator = 20.0
    f1.denominator = 43.0
    var f2 = Fraction()
    f2.numerator = 9.0
    f2.denominator = 21.0

    //შეკვეცის წილადი
    println(f2)
    println(f1)
    //შეკვეცილი წილადი
    println(f1.shortening())
    println(f2.shortening())


    //წილადების მიმატება
    println(f1.mimateba(a = 20.0, b = 43.0, c = 9.0, d = 21.0))
    println(f2.mimateba(5.0, 11.0, 25.0, 16.0))
    //წილადების გამრავლება
    println(f1.gamravleba(5.0, 11.0, 25.0, 16.0))








}


//წილადები
class Fraction{
    var numerator: Double = 0.0
    var denominator: Double= 0.0

    fun printFraction() {
        println("${this.numerator}/${this.denominator}")

    }

    override fun toString():
            String {
        return " $numerator/ $denominator"

    }



//შესაკვეცი ფუნქცია

    fun shortening(): String{
        if(numerator==denominator){
            return "1"

    }
        else {
        return "${numerator / usg(a=numerator, b=denominator)} / ${denominator / usg(a=numerator, b=denominator)}"
        }
}
        //ილადების მიმატება
    fun mimateba(a: Double, b: Double, c: Double, d: Double): String {
        if (b == d ){
            return "${a + c} / $b"
        } else {
            return "${a*d+c*b} / ${b*d}"
        }
    }
        fun gamravleba(a: Double, b: Double, c: Double, d: Double):String{
            return "${a*c} / ${b*d}"
        }
    }

    // ვიპოვოთ უსგ

    fun usg( a: Double,b:Double):Double   {
        if(a==b) {
            return a

        }
        if (a>b) {
            return usg(a-b,b)}
        else {return usg(a, b-a)
        }
    }



// პოინტები
class Point(var x:Double, var y:Double){
    override fun toString(): String {
        val a = x.toString()
        val b = y.toString()
        return a+b
    }
    //a,b  p1-is  x,y - c,b არის p2-is x,y
    fun equal(a:Double, b:Double, c:Double, d:Double):Boolean{
        return a==c && b==d
    }
}

fun iqsi(Y:Double, Z:Double): Double {
    return Y - Z
}
fun igreki(X:Double, Z: Double):Double{
    return X - Z
}
//MZULSSSSS KOTLINIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII