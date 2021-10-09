class StabilizerStarter{
	public static void main(String[] cfe)
	{
		Stabilizer stable=new Stabilizer("Syspro");
		System.out.println(stable);
		System.out.println(stable.brand);
		
		Stabilizer stable1=new Stabilizer("black");
		System.out.println(stable1);
		System.out.println(stable1.color);
		
		Stabilizer stable3=new Stabilizer("220");
		System.out.println(stable3);
		System.out.println(stable3.voltage);
		
		Stabilizer stable4=new Stabilizer("price");
		System.out.println(stable4);
		System.out.println(stable4.price);
		
		Stabilizer stable5=new Stabilizer("number");
		System.out.println(stable5);
		System.out.println(stable5.number);
	}
	
}