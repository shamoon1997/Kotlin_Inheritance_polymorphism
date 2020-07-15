

fun main()
{
    var arr= arrayOf("abc","def");
    var array= arrayOf(1,2,3) ;
    println(arr[1]);
    println(arr.get(0));
    arr.set(0,"Shamoon")
    println(arr.size);

    for (i in arr)
    {
        for (j in array)
        {
            print(j)
        }
        println(i)
    }

}