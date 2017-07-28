/*
 * Problem Statement :Write a program in Java to show the use of super and this keyword with a constructor, methods,
 * variables
 */


package com.acadglid.assignment2;

//Parent Class 

public class Assignment2 {
	
	//Declare variable in parent class 
	
	String variable = "I am super variable"; 
	
	//Create constructor 
	
	Assignment2(){
		
		System.out.println("I am super constructor");
		
	}
	
	//Create method 
	
	void myMethod() {
		
		System.out.println("I am super method");
	}
	

}

//Class extend parent class 

 class subclass extends Assignment2{
	 
	 // Create variable with same name in parent class 
	 
	 String variable = "I am sub variable"; 
	 
	
		
	// create method with same name in parent 
	 
	 void myMethod(){
		 
		 System.out.println("I am sub method with same name in parent");
	 }
	 
	 
	 
	 void exampleMethod() {
		 
		// Call to  method which is in parent class even though method is in sub class by use of super
		 
		 System.out.println("prefix super.myMethod() will make call to parent method if same name in sub class and parent class.");
		 super.myMethod();
		 
		 System.out.println("myMethod() will make call to  method in sub class.");
		 myMethod();
		 
		 System.out.println("prefix super.variable will make call to parent variable if same name in sub class and parent class i.e. super.variable-->"+super.variable);
		 
		 System.out.println("only variable will make call to  sub class ai.e. variable-->"+super.variable);
		 
		 
		 
		 
		 
		 
	 }
	 
	 
}	

