package package2;

import package4.Interface;



public class AccessModifiers {
	private double m1;
	int m2;
	protected String m3;
	public int m4;
	final int m6=44;
	
 public static void main(String[] args) {
	 other v2=new other();
	 v2.am2();
	 
	
	 
}
void am1(){
	double m5;
	m1=5.7;                     //private variable so accessing in the same class
	m2=7;
	
	System.out.println("m5 is "+ (m5=m1+m2));
	String[] h=new String[3];      //imported from other project 
	Interface.main(h);
	}
}
class other {
	void am2(){
	AccessModifiers v1=new AccessModifiers();
	v1.am1();
	v1.m2=1234;            //default variable so accessing in the same package
	System.out.println("m2 is "+ v1.m2);
	System.out.println(v1.m6);                //final keyword 
	System.out.println(v1);      //calling object of AccessModifiers i.e., to string() method
	}
	
}
