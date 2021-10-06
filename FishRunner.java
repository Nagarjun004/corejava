class FishRunner{
	
	public static void main(String [] values){
		
		Fish fish=new Fish();
		System.out.println(fish.fishName);
		System.out.println(fish.color);
		System.out.println(fish.weight);
		System.out.println(fish.category);
		System.out.println(fish.length);
		
		fish.category="jawed";
		fish.length=8.0f;
		
		
		System.out.println(fish.fishName);
		System.out.println(fish.color);
		System.out.println(fish.weight);
		System.out.println(fish.category);
		System.out.println(fish.length);
		
		
		
		
		
		
		
	}
	
	
	
}