package package2;

public class LocalGlobal 
{
  int a;
  double b;
  String c;
   void add(int a,double b,String c) 
   {
	   System.out.println(c);
   }
   
	public static void main(String[] args) 
	{
		System.out.println("hello");
		LocalGlobal l=new LocalGlobal();
		l.add(2, 88.8, "ss");
		System.out.println(l.c);

	}

}
