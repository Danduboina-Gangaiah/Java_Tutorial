class Test
{
 int        x;
 static int y;
}
class Demovariables
{
 int        a;
 static int b;
 public static void main(String args[])
  {
  Test.y=56;
  Demovariables.b=78;
  System.out.println("x value is   "+y);
  }
}
