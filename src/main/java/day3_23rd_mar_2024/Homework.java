package day3_23rd_mar_2024;

public class Homework {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		secondassignement();
		int year1 = 1900;
		int year2= 1996;
		int year3 = 2002;
		int year4 = 2000;
		determineleapyear(year1);
		determineleapyear(year2);
		determineleapyear(year3);
		determineleapyear(year4);
	}
		
		
		
		
		

				
				public static void secondassignement() {
					int i= 10;
					int j =20;
					int k=30;
					int l=40;
					if ((i<j) && (i<k) && (i<k)){
						System.out.println("i is the smallest " + i);
					}else if((j<i)&&(j<k) && (j<l)) {
						System.out.println("j is the smallest " +j);
					}else if ((k<i)&&(k<j)&&(k<l)) {
						System.out.println("k is the smallest " +k);
					}else  {System.out.println("j is the smallest " +l);
					}}
					
					
				
			
		public static void determineleapyear(int year) {
			
			
			
					
			
			
			
			
			
			
			
			
			
			
			
				
				
			
		if (year % 4 ==0) {
			if (year % 100 != 0){
			System.out.println(year + " is a leap year ");
			}else if  (year % 400 ==0 )
				{System.out.println(year + "is  leap year");
			
				}else  {
					System.out.println(year + "is  not a leap year");
				}
			
		}
		
		else {
			System.out.println(year + "is not a leap year");
		}
		
		
		
		
		
		
		
		
		
		
	}		
			
			
			
					
					
					
					
					

	

}
