class ComputerStarter{
	public static void main(String[] args)
	{
		Computer computer1=new Computer();
		computer1.modelNo="p6774y";
		computer1.price=55.5f;
		computer1.displayDetails();
		computer1.displayTotalPrice();
		computer1.displayTotalOfAll();

		Computer computer2=new Computer();
		computer2.brand="dell";
		computer2.modelNo="H61h2-M4";
		computer2.price=56.7f;
		computer2.quantity=3;
		computer2.type=ComputerType.MINICOMPUTER;
		computer2.displayDetails();
		computer2.displayTotalPrice();
		computer2.displayTotalOfAll();

		Computer computer3=new Computer();
		computer3.modelNo="c061";
		computer3.price=25.5f;
		computer3.type=ComputerType.GAMING;
		computer3.displayDetails();
		computer3.displayTotalPrice();
		computer3.displayTotalOfAll();

		Computer computer4=new Computer();
		computer4.modelNo="DH55HC";
		computer4.price=70.50f;
		computer4.type=ComputerType.PERSONALCOMPUTER;
		computer4.quantity=4;
		computer4.displayDetails();
		computer4.displayTotalPrice();
		computer4.displayTotalOfAll();

		Computer computer5=new Computer();
		computer5.modelNo="XPS 15 9530";
		computer5.price=62.25f;
		computer5.type=ComputerType.SUPERCOMPUTER;
		computer5.quantity=5;
		computer5.displayDetails();
		computer5.displayTotalPrice();
		computer5.displayTotalOfAll(); 

	}
} 