class StringLearner{
	
	public static void main(String[] drinks)
	{
		String company=new String("MAHINDRA");
		System.out.println(company);
		char[] carName={'x','u','v'};
		String name=new String(carName);
		System.out.println(name);
		String brand=new String("puma");
		System.out.println(brand);
		int[] numbers={65,66,67,68,69,70};
		String codePoints=new String(numbers,2,3);
		System.out.println(codePoints);
		byte[] numbers2={70,71,72,73,74,75};
		String conversion=new String(numbers2);
		System.out.println(conversion);
		String conversion1=new String(numbers2,1,4);
		System.out.println(conversion1);
		StringBuffer ref=new StringBuffer("x-workz");
		String buffer=new String(ref);
		System.out.println(buffer);
		char[] animalName={'L','i','o','n'};
		String animalNameIs=new String(animalName);
		System.out.println(animalNameIs);
		StringBuilder ref2=new StringBuilder("Banglore");
		String builder=new String(ref2);
		System.out.println(builder);
		
		if(company!=brand)
		{
			System.out.println("both strings are not pointing to same memory");
		}
		else
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean contains=brand.contains("pu");
		System.out.println(contains);
		
		int codePoint=company.codePointAt(3);
		System.out.println(codePoint);
		
		int beforeChar=buffer.codePointBefore(3);
		System.out.println(beforeChar);
		
		char Char=name.charAt(2);
		System.out.println(Char);
		
		boolean check=animalNameIs.endsWith("n");
		System.out.println(check);
		
		
		String CarName="xuv700";
		String engine="petrolEngine";
		String concat=CarName.concat(engine);
		System.out.println(concat);
		
		String ref3=name.concat(company);
		System.out.println(ref3);
		
		String ref4=brand.replace('u','0');
		System.out.println(ref4);
		
		String ref5=animalNameIs.toUpperCase();
		System.out.println(ref5);
		
		String ref6=name.toLowerCase();
		System.out.println(ref6);
		
		String ref7=brand.trim();
		System.out.println(ref7);
		
		int compare=company.compareTo(brand);
		System.out.println(compare);
		
		String ref8=String.copyValueOf(carName);
		System.out.println(ref8);
		
		boolean ref9=brand.startsWith("p");
		System.out.println(ref9);
		
		
		
	
		
	}
}
		
		
		
		