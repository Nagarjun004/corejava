class StringStarter{
	
	public static void main(String[] drinks)
	{
		String company="MAHINDRA";
		String name="xuv700";
		float milage=13.0f;
		int torque=360;
		String color="black";
		boolean awd=false;
		String seatCover="Yellow";
		double kmDriven=2388.0;
		String place="Kalaburgi";
		double price=2000000.0;
		
		if(name!=color)
		{
			System.out.println("strings are not pointing to same memory");
		}
		else
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean ref1=place.contains("rg");
		System.out.println(ref1);
		
		char ref2=seatCover.charAt(5);
		System.out.println(ref2);
		
		boolean ref3=color.endsWith("k");
		System.out.println(ref3);
		
		String ref4=color.concat(name);
		System.out.println(ref4);
		
		boolean ref5=seatCover.matches("Yellow");
		System.out.println(ref5);
		
		String ref6=company.replace('r', 'y');
		System.out.println(ref6);
		
		String ref7=name.replaceAll("XUV700","XUV500");
		System.out.println(ref7);
		
		boolean ref8=place.startsWith("K");
		System.out.println(ref8);
		
		String ref9=company.toLowerCase();
		System.out.println(ref9);
		
		String ref10=name.toUpperCase();
		System.out.println(ref10);
		
		String ref11=name.trim();
		System.out.println(ref11);
		
		
	}
}