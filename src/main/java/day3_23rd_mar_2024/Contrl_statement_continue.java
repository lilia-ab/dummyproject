package day3_23rd_mar_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contrl_statement_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static void whatIsSwitch() {
		
		//switch statement is a multiay branch statement
		//switch statement defines multiple paths of execution of a program
		//switch statement povids better alternative than a large series of if-else statements
		
		
		
		
		
	}
	
	public static void decideWichBrowser() {
		
		//the variable to be tested
		//this variable could be an int, String,char, etc
		
		
		switch("deciide which browser to be configured for my automation") //intent
		{
		case "chrome":
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https;//google.com");
			break;
			
			
		case "firefox":
			WebDriver driver1= new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https;//amazon.com");
			break;
			
			
			
		case "Edge":
			WebDriver driver3= new EdgeDriver();
			driver3.manage().window().maximize();
			driver3.get("https;//google.com");
			break;
		
			
		default	:
			System.out.println(".....");
		}


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void whichDigitDenotesWhichMonth() {
		int month = 13; //July
		String monthName = "";

		switch(month) {

		case 1: monthName="1 - January";
		break;

		case 2: monthName="2 - February";
		break;

		case 3: monthName="3 - March";
		break;

		case 4: monthName="4 - April";
		break;

		case 5: monthName="5 - May";
		break;

		case 6: monthName="6 - June";
		break;

		case 7: monthName=" 7 - July";
		break;

		case 8: monthName=" 8 - Aug";
		break;

		case 9: monthName=" 9 - Sep";
		break;

		case 10: monthName=" 10 - Oct";
		break;

		case 11: monthName=" 11 - Nov";
		break;

		case 12: monthName=" 12 - Dec";
		break;

		default: System.out.println("Invalid month number value");
		}
		//Print the month
		System.out.println(monthName);
		}
	
	
	
	
}
