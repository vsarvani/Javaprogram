package package3;

import package2.AccessModifiers;

public class AccessModifiers2 {
public static void main(String[] args) {
	other1 v3=new other1();
	v3.am3();
	
}
}
class other1 extends AccessModifiers{
	void am3(){
		this.m3="Accessing Protected Variable from other package in child class by using child class object";  //this keyword
		this.m4=8;                         //this keyword
		System.out.println(this.m3);
		System.out.println(this.m4);  //accessing public variable in other package
	}
}
