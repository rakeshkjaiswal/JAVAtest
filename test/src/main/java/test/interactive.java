package test;

import java.util.Scanner;

public class interactive {
	Scanner sc = new Scanner(System.in);
	String name;
	void takeInput() {		  
		System.out.println("Enter your name");
		name = sc.nextLine();
    }
	void printOutput() {
		System.out.println("Your name is " + name);
	}
}
