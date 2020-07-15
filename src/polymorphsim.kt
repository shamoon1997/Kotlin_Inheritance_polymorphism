
fun main()
{
 val shape2: shapes=circle(1.4);
    println(shape2.calculate_area());
    val square1 : shapes=squares(3.0);
    //println(square1.calculate_area())

    val shape1: shapes=shapes();
    //println(shape1.calculate_area());

    var shapess= listOf<shapes>(shape1,square1)
    calculae_area(shapess)


}
fun calculae_area(shapeslist: List<shapes>)
{
    for (obj in shapeslist)
    {
        println(obj.calculate_area());
    }
 val iterator=shapeslist.iterator();
    while (iterator.hasNext())
    {
        println(iterator.next().calculate_area());
    }

}

open class shapes
{
    open fun calculate_area():Double
    {
     return 0.0;
    }
}
class circle(var radius: Double):shapes()
{
    override fun calculate_area(): Double {
        return radius*radius;
    }
}
class squares(var length:Double):shapes()
{
    override fun calculate_area(): Double {
        return length*length;
    }
}