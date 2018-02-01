package package1;

public class BasicConcepts {

         int a;                                   //non-static variable
        static int b=8;                           //static variable

    BasicConcepts(){
	System.out.println(BasicConcepts.b);      //calling static variable directly using class name
	System.out.println("inside zero arguement constructor value");
   }

  BasicConcepts(int c){
	System.out.println("c is"+c);
	System.out.println("inside one arguement constructor");
  }
                                                             //constructor overloading

  public static void main(String[] args) {
	System.out.println("This is my first program");
	BasicConcepts obj1=new B();   
	obj1.m2();
    
   }

  void m1(){                              // non-static instance method
	new BasicConcepts(2);                         //creating object for class A with one arguement
	System.out.println("inside m1");
	
  }  
  void m1(int f){                           //local variable f
	m1();
	System.out.println("f is"+f);
	System.out.println("inside one arguement method");      //method overloading,compiletime polymorphism
  }

   void m2(){   
	 m1(4);
	 System.out.println("inside BasicConcepts m2");	

  }
  static void m3(){                               //static method
	
	System.out.println("inside BasicConcepts m3");
	BasicConcepts obj=new BasicConcepts();
	obj.m2();
  }

 }

class B extends BasicConcepts {                                //Single level inheritance


   void m2() {                             //method overriding, runtime polymorphism
    int n,i;
	int[] arr=new int[4];                     //array initialization using for loop

	for(i=0,n=6;i<4;i++,n--){
	arr[i]=n+2;
	System.out.println(arr[i]);
      }
	System.out.println("inside B m2");           //super keyword
	super.m3();
	
   }

  }
class B1 extends B{                          //multilevel inheritance          
void m5(){
System.out.println("inside B1 m5");
}
}
