class LighterRunner{
	
	  public static void main(String [] values){
		
		boolean check=Lighter.onMethod();
		System.out.println(check);
		boolean check2=Lighter.offMethod();
		System.out.println(check2);
		int width=4;
		boolean size=Lighter.light(width);
		System.out.println(size);
	}
	
}