package P2;

abstract class Bike{
	int a;
	Bike(){
		System.out.println("Inside Bike Constructor:" + a + "\n");
	}
	
	abstract void run(); //abstract method!(0-100%)
	
	void display() {
		System.out.println("This is display method");
		
	}
}

class Honda4 extends Bike{
	@Override
	void run() {
		
	}
}


public class P09_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4();
		//obj.run();
		obj.display();
		//cannot be initiated
		//Bike obj2=new Bike();
	}

}

//Final class

final class Super{
	public int data=30;
	
	void display() {
		System.out.println(data);
	}
}

/*public class Sub extends Super{
           void display2(){
           display(); 
}*/

