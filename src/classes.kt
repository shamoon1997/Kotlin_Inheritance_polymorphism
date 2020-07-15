fun main()
{
    var vitz=car("Vitz",107200,true);
    var m1=mobile("Mobile",0,0);
    m1.print_name();
    var m2=smartphone("Qmobile",22,23);
    m2.print_name();
}

class car(val name : String, var km_run : Int,has_air_bag:Boolean)
{

}
open class mobile(var name: String, var display_size:Int, var screen_resolution:Int)
{
    open fun print_name():Int
    {
        println("Mobile is printed");
        return 0 ;
    }
    fun screen_reso()
    {
        println("Screen reso is");
    }
}
class smartphone(name: String,display_size: Int,screen_resolution: Int):mobile(name,display_size,screen_resolution)
{
    override fun print_name(): Int {

        println("Smart mobile is printed");
        return 0;
        //return super.print_name()
    }
    
}