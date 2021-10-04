class Bottle{
	
public static void storing(int price,String colour,int height,String quality,String [] brands){
	
	System.out.println("invoked bottle");
	System.out.println("bottle price:"+price);
	System.out.println("colour of the bottle:"+colour);
	System.out.println("height of the bottle:"+height);
	System.out.println("quality of the bottle:"+quality);
	System.out.println("brands:");
	for(int bottleIndex=0; bottleIndex<brands.length;bottleIndex++){
		
		String bottle=brands[bottleIndex];
		System.out.println(bottle);
		
		
	}
	
	
}
	
}