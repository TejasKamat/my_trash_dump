class Array2
{
	public static void main(String args[])
	{
		int c[]={10,20,30,40,50};
		int len=c.length;
		System.out.println("The length of array is:"+len);
		
		for(int i=0;i<len;i++)
		{
			System.out.println("The number in "+i+" is:"+c[i]);
			System.out.println("The number after squaring "+i+" is:"+c[i]*c[i]);
		}
	}
}	