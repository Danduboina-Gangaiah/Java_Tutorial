class Test
{
  int   a;
  float b;
}
class DemoVariable
{
 int c;
 int d;
 public static void main(String args[])
 {
   Test ob1=new Test();
   ob1.a=13;
   Test ob2=new Test();
   ob2.b=12;
   DemoVariable ob3=new DemoVariable();
   ob3.c=14;
   DemoVariable ob4=new DemoVariable();
   ob4.d=15;
   System.out.println("A value is  "+ob1.a);
   System.out.println("B value is  "+ob2.b);
   System.out.println("C value is  "+ob3.c);
   System.out.println("D value is  "+ob4.d);
 }
}