package day3_23rd_mar_2024;

public class Topic7_operators_in_java {

	
	//aritmetic operators ->        +  -  *  /  %     ++(increment)   --(decrement)
	
	//Assignement operators->     =  +=   -=   *=    /=     %=    &=   |=   ^=   >>=    <<=
	
	//comparaison operators ->    ==   !=  >   <    >=    <=  <>
	
	// logical operators->        &&(returns true if both the statement are true),   || (returns true if either statement is true)
	 //syso ! revers any result
	public static void main(String[] args) {
		 int i = 1;
		 i+= 5;  // i=i+5
		 System.out.println(i);
		 
		 int a =2;
		 int b = 2;
		 int j = 2;
		 int k = 3;
		 int l = 4;
		 System.out.println(a != b);
		  System.out.println(!(i<j && k>l));
				 
	}
}
