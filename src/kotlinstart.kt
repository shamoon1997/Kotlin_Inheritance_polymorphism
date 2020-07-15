

fun main(args : Array<String>)
{
println("Hello kotlin");

   var s=student("Shamoon",22);
    s.age=-3;
    println(s.age);

    var s1=square("square",3);
   print(s1.area());
}
abstract class shape(var _name : String)
{
    var name : String=_name ;
    abstract fun area():Int ;


}
class square(_name: String,_lenght : Int):shape(_name)
{
    var lenght:Int=_lenght ;
    override fun area(): Int {
      return lenght* lenght ;
    }

}


class student(var _name : String, var _age : Int)
{
 lateinit var name:String
    var age: Int  =_age
        get() {
            return field+1 ;
        }
    set(value) {
        if (value>0)
        {
            field=value;
        }
        else
        {
            println("Cannot assign");
        }

    }

}