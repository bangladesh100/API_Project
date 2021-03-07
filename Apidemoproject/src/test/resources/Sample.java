
public class Sample {
	
	package hotel.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	     public class Room {
	     
	    	
	    	 
	    	 
	    	 // if you leave this line it will be ok
	    	 //public static void main(String[] args) {
		@Test
			public void test() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\md200\\OneDrive\\Desktop\\chromedriver_win32 (3)");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hotels.com/");
			
			
		}
		
		@Test
		public void verifyTitle()
		{
		driver.get(https://www.amazon.com);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = “Welcome to Amazon”;
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println(“Assert passed”);
		 
		}
		 
		@AfterTest
		public void closedriver(){
		 
		//closes the browser instance
		driver.close();
		 
			
			//destination
			
			  /*driver.findElement(By.xpath("//*[@name='q-destination']")).
			  sendKeys("New York, New York, United States of America");
			  
			 // driver.findElement(By. xpath("//body[@class='LTR']")).click();
			  driver.findElement(By.xpath("//body[@data-os-imp='pageImpression']")).click();
			  //close driver.findElement(By.xpath("//body[@class='LTR']")).click(); //
			 // check in
			  
			  // date 13 nov select
			  driver.findElement(By.name("q-localised-check-in")).click();
			  
			   driver.findElement(By.xpath("//body[@class='LTR']")).click(); //
			
			  
			  Thread.sleep(5000);
			  driver.findElement(By.id("widget-query-label-4")).click();
			  
			  // check out jan 1, 2021
			  driver.findElement(By.xpath("//body[@class='LTR']")).click();
			  
			  driver.findElement(By.xpath("//body[@class='LTR']")).click();
			  
			  driver.findElement(By.xpath("//*[@class='cta cta-strong']")).submit();
		
		}*/
			//==================================================
			/*driver.findElement(By.xpath("widget-query-label-2")).click();
			
			driver.findElement(By.id("widget-query-label-2")).click();
			
			
			
	 
	      
			Thread.sleep(5000);	driver.findElement(By.xpath("//*[@name='q-localised-check-in']")).click();
	       
			Thread.sleep(5000);
			driver.findElement(By. xpath("(//table/tbody/tr[2]/td[4]/a)[1]")).click();
	       
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='cta cta-strong']")).submit();
		}

	}
	*/

     
