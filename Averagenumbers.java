class Averagenumbers
{
	static int average(int a,int b,int c)
	{
		c= (a+b+c)/3;
		return c;
		
	}
	static float average(float a,float b,float c)
	{
		
		c= (a+b+c)/3;
		return c;
		
	}
	public static void main (String args[])
	{
		Averagenumbers ob =new Averagenumbers();
		System.out.println( "Integer average="+ob.average(5,10,15));
		System.out.println( "Float Average="+ob.average(5.5f,10.9f,15.2f));
	}
}