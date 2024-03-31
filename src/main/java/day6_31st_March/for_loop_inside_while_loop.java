package day6_31st_March;

public class for_loop_inside_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starpatternprogram();
		starpatternprogram2();
		starpatternprogram3();
	}
public static void starpatternprogram() {
	
	
	
	for(int i=1;i<=5;i++) {
		
		for (int j=1;j<=5;j++)
		{
			System.out.print("*");
			}
			
		
		System.out.println();
	}
}
	
	
	
	
	
	
	


public static void starpatternprogram2() {
	
	
	
	for(int i=1;i<=5;i++) {
		
		for (int j=1;j<=i;j++)
		{
			System.out.print("*");
			}
			
		
		System.out.println();
	}
}









public static void starpatternprogram3() {
	
	
	
	for(int i=1;i<=5;i++) {
		
		for (int j=5;j>=i;j--)
		{
			System.out.print("*");
			}
			
		
		System.out.println();
	}
}
	



public static void starpatternprogram4() {
	
for(int i=1;i<=5;i++) {
		
		for (int j=1;j<=i;j++)
		{
			System.out.print("*");
			}
			
		
		System.out.println();
	}
for(int i=1;i<=4;i++) {
	
	for (int j=5;j>=i;j--)
	{
		System.out.print("*");
		}
		
	
	System.out.println();
}
	
}



}
