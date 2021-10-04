class Movie{
	public static void entertain(int ticketPrice,float movieLength,String movieName,float rating,String[] actors){
		
		
		System.out.println("invoked entertain");
		System.out.println("ticket Price:"+ticketPrice);
		System.out.println("length of the movie in hours:"+movieLength);
		System.out.println("name of the movie:"+movieName);
		System.out.println("rating of the movie:"+rating);
		System.out.println("actors in the movie:");
		for(int actorIndex=0; actorIndex<actors.length; actorIndex++)
			
			{
				
				String actor=actors[actorIndex];
				System.out.println(actor);
				
				
			}
		
		
	}
	
	
	
}