package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		// Iheritance | Vererbung
		
		Child child = new Child();
		
		// Mehrfachvererbung NICHT Möglich
		// Child --> Parent --> Grandparent 
		// Serielle Vererbung (serial inheritance)
		
		child.sayHello();
		child.sayHello1();
		child.sayHello2();
		
		// gleiche SIGNATUR --> Overriding		
	}

}
