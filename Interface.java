package package4;

public  class Interface {    
public static void main(String[] args) {
	num x2=new num();
	x2.A3();
	
}
}
interface B{              
	void A2();
	
}
abstract class num2{
	abstract void A3();  //abstract method
	void A4(){          //concrete method
		System.out.println("inside num2 A4");
	}
	
	
}
class num extends num2{           //overriding num2 class abstract method in num class
	
	public void A3(){
		
		num1 x=new num1();
		x.A2();
		System.out.println("inside Interface class A1");
	}
}
class num1 implements B {              //overriding abstract method in interface
	public void A2(){
	
		System.out.println("inside num1 A2");
	}
	
}