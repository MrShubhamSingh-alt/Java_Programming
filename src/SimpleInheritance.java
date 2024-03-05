class Nokia1
{
    int x, y;
    void f1()
    {
        System.out.println("Parent's  function executed:");
    }

}
class Nokia2 extends Nokia1
{
    int z ;
    void f2()
    {
        System.out.println("Child function executed:");
    }
}
public class SimpleInheritance
{
    public static void main (String [] args)
    {
        Nokia2 n1 = new Nokia2();
        n1.f1();
        n1.f2();
        n1.x = 5 ;
        System.out.println(n1.x);
    }
}
