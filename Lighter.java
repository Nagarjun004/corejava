class Lighter{
	
	public static boolean onMethod(){
		
		System.out.println("invoked on");
		boolean on=true;
		if(on)
		{
			System.out.println("lighter is on");
			return true;
		}
		else
		{
			System.out.println("lighter is off");
			return false;
		}
		
	}
	public static boolean offMethod(){
		
		System.out.println("invoked off");
		boolean off=true;
		if(off)
		{
			System.out.println("lighter is off");
			return true;
		}
		else
		{
			System.out.println("lighter is on");
			return false;
		}
	}
	public static boolean light(int width){
		
		System.out.println("invoked light");
		if(width>0)
		{
			System.out.println("width is greater than zero");
			return true;
		}	
		else
		{
			System.out.println("width is:"+width);
			return false;
			
			
			
			
		
		}
		
		
		
		
	}
	
	
}
	
	