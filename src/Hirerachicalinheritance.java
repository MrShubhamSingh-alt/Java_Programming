class Nokia3
{
    int x;
}
class Nokia4 extends Nokia1
{
    int y = 10;

    void f2()
    {
        System.out.println(x);
        System.out.println(y);
    }

}
class Nokia5 extends  Nokia1
{
    int y = 20 ;
    void f2()
    {
        System.out.println(x);
        System.out.println(y);
    }
}
public class Hirerachicalinheritance
{
    public static void main (String [] args)
    {
        Nokia4 n1 = new Nokia4();
        Nokia5 n2 = new Nokia5();
        n1.f2();
        n2.f2();
    }
}
