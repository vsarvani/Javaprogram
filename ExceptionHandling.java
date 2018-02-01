package package4;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling  {
	public static void main(String[] args){
	ExceptionHandling e=new ExceptionHandling();
	e.m1();
	}
	void m1(){
		int a=12;
		int b=4;
		try{
		int c=a/b;
		try{
			throw new IOException();
		}
		
		catch(Exception e2){                   //generic catch block
			System.out.println("io");
		     }
		finally{
			System.out.println("this block will execute even the exception is not handled");
		}
		  
		  }
		catch(ArithmeticException e2){
			System.out.println("ae");
		}
		
		System.out.println("exceptionhandling");
	}
}
