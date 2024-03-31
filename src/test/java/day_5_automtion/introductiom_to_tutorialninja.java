package day_5_automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class introductiom_to_tutorialninja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tutorialsninja();
	}
	
	
		public static void tutorialsninja() {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("hihllo8@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        
        
        
		}
        public static void reddifi() {
        	
        	
        	
        	WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://amazon.com");
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://walmart.com");
            
            driver.quit();
            
            
        	
        	
        	
        }

	

}
