fun main() {
    var result=detail("Gubo","gubodibawario@gmail.com")
    println(result)

    var reslt=scores(arrayOf(62,65,71,25,51))
    println(reslt)

    println( places("Nairobi"))

    var detail= arrayOf("gubo","diba","anitab")
    println(detail)

    var calc=Calculator(6.1,4.0,2.4,12.0)
    calc.addition
    println(calc.addition)
    calc.subtraction
    println(calc.subtraction)


}
//No 1
fun detail(fname:String,email:String):String{
    return("${email[0]}")

}
//No 2
fun scores(score:Array<Int>){
    println(score.max())
    println(score.min())
    println(score.average())

}
//No 3
fun places(place:String){
    var place="Naiorbi"
    println(place.split(" "))

}
//No 4
fun details(detail:Array<String>):String{
    return (detail[0].toString() + detail[1]+detail[3])
}


class Calculator(var addition:Double,var subtraction:Double,var division:Double,var multiplication:Double){
    fun addition(addition: Double){
        var add=2.0+addition
        println(addition)
    }
    fun substraction(){
        var sub=2.0-subtraction

    }
    fun division(){

    }


}