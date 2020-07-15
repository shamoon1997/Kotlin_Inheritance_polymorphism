fun main()
{
var rectangle1=Rectangle(1,2);
    rectangle1.draw();
}

interface drawable
{
    fun draw();
}
class Rectangle(var length:Int, var width: Int):drawable
{
    override fun draw() {
      println("Rectangle is drawing ");
    }

}