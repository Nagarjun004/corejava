class TrainRunner{
	
	public static void main(String[] values){
		
		Train train=new Train();
		
		System.out.println(train.name);
		System.out.println(train.color);
		System.out.println(train.length);
		System.out.println(train.noOfBox);
		System.out.println(train.trainNumber);
		
		
		train.color="green";
		train.length=600.f;
		train.trainNumber=545454;
		
		System.out.println(train.name);
		System.out.println(train.color);
		System.out.println(train.length);
		System.out.println(train.noOfBox);
		System.out.println(train.trainNumber);
		
		
		
	}
	
	
	
}