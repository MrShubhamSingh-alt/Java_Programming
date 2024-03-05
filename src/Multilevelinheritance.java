class A
{
  int x = 10 ;
}
class B extends A
{
    int y = 20 ;

    void f1()
    {
       System.out.println(y+x);
    }

}
class C extends A
{
   int y = 30 ;
   void f1()
   {
       System.out.println(y+ x);
   }
}
public class Multilevelinheritance
{
    public static void main(String [] args)
    {
        B n1 = new B() ;
        C n2 = new C() ;
        n2.f1() ;
        n1.f1();



    }
}
