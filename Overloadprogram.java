package package2;

public class Overloadprogram 
{
	void main()
	{
      System.out.println(1);
	}
	 void main(double d)
	 {
		System.out.println(2); 
	 }
	

	public static void main(String[] args)
	{
		System.out.println(3);
		Overloadprogram o=new Overloadprogram();
		o.main();
		o.main(55.7);
		
	}

}

