class Lock{
	void open(int price)
	{
		System.out.println("invoked lock open");
		System.out.println(price);
	}
	void close()
	{
		System.out.println("invoked lock close");
	}
} 