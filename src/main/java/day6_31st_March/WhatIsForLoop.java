package day6_31st_March;

public class WhatIsForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print100to1();
		printfirst10evennumbers();
		printfirst100evennumbers();
		print1to100();
		printfirstevnnumberandthesum();
		
	}
	public static void syntaxofforloop() {}
	
	
	/*
	 for(initialize; condition; inc/dec){}
	 */
	
	
	
	public static void print100to1() {
		
		
		
		for(int i = 100; i>1;i--) 
		{
			System.out.println(i);
		
		
		}
	}
	
	
	
	
public static void printfirst10evennumbers() {
		
		
		
		for(int i = 0; i<=10;i++) 
		{
			if(i%2==0) 
			System.out.println(i);
		//or System.out.println(i*2);
		
		}
	}




public static void printfirst100evennumbers() {
	
	
	
	for(int i = 0; i<=100;i++) 
	{
	
	System.out.println(i*2);
	
	}
}

	

public static void print1to100() {
	
	
	
	for(int i = 0; i<=100;i++) 
	{
	
	System.out.println(i);
	
	}
}




public static void printfirstevnnumberandthesum() {
	
	int sum=0;
	
	for(int i = 0; i<=100;i++) 
	{
	
	System.out.println(2*i);
	sum=sum+2*i;
	System.out.println("every step  " +sum);
	
	}
}




}
