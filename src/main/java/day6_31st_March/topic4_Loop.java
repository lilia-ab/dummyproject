package day6_31st_March;

public class topic4_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNubersToten();
		print50wholenumbers();
		Print20Multiplesof5();
		print();
	}

	
	
	
	public static void WhatisWhileLoop() {
		int i=1;
		while(i<6) {
			
			System.out.println("keep print");
			i++;
		}
		
		
		
		
		
	}
	public static void PrintNubersToten() {
		
		int i=1;
		while(i<=10) {
			System.out.println("the number is " +i);
			i++;
		}
		
		
		
		
		
	}
	
	
	public static void print50wholenumbers() {
		
	int i=0;
		while(i<=49) {
			
			System.out.println(i);
			i++;
		}
		
		
		}
	
	
	
	
	
	public static void Print20Multiplesof5() {
		
		int i=1;
		
while(i<=20) {
			
			System.out.println(i*5);
			i++;
		}
		
		
		
	}
	
	
	
	
	
	public static void print() {
	
	
		
		int i=1;
		int k=0;
		while(i<=20) {
					
					
					System.out.println(i*5);
					 k = k+(i*5);
					i++;
					System.out.println(k);


				
				}
		
		
	}
	
	
}





