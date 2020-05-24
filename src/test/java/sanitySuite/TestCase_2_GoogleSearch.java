package sanitySuite;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.PageBase;
import base.TestBase;
import pages.Syn_google_search;

@Test

public class TestCase_2_GoogleSearch extends TestBase{
	
	Syn_google_search obj;
	
	public void open_url() {

		log.info("Open Building Site URL.");
		driver.get(data.getProperty("base.url"));
		PageBase.wait(5);
		log.info("email page");
		obj = new Syn_google_search (driver);
		obj.emailId_method();
		log.info("submit");
		obj.emailNext_method();
		log.info("Password");
		obj.passWord_method();
		log.info("submmit");
		obj.submmit_method();
		PageBase.wait(4);
	/*	log.info("logout");
		obj_google_search.logOut_method(); */
		log.info("select building");
		obj.buildingSelect_method();
		PageBase.wait(40);
		log.info("select zone");
		obj.zone_method();
		PageBase.wait(6);
		obj.add_zone_vacation_method();
		PageBase.wait(3);
		obj.add_zoneName_vacation_method();
		
		 PageBase.wait(2);
		   String month=  driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
		     	
				System.out.println(month);
				
			while (!month.contains("JUNE 2020")) { 
					System.out.println(month);
					 driver.findElement(By.xpath("//th[@class='next available ng-star-inserted']")).click();
					month = driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
				}
				
				month = driver.findElement(By.xpath("//th[@class='month drp-animate']")).getText();
				System.out.println(month);
				PageBase.wait(3);
				
			        
			 List<WebElement> dateAv = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]"));
				       int countAv=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).size();
				        
				        for (int i=0; i<countAv; i++) {
				        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).getText();
				        System.out.println(text);
				        if(text.equalsIgnoreCase("16")) {
				        	
				        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).click();
				       break;
				        }
				        	
				        } 
				        
				        PageBase.wait(3);
			
		    // end date
				        
				        
				        
				        String month1=  driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
				     	
						System.out.println(month1);
						
					while (!month1.contains("JUNE 2020")) { 
							System.out.println(month);
							 driver.findElement(By.xpath("//th[@class='next available ng-star-inserted']")).click();
							month1 = driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
						}
						
						month1 = driver.findElement(By.xpath("//th[@class='month drp-animate']")).getText();
						System.out.println(month);
						PageBase.wait(3);
						
					        
					 List<WebElement> dateAv2 = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]"));
						       int countAv2=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).size();
						        
						        for (int i=0; i<countAv2; i++) {
						        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).getText();
						        System.out.println(text);
						        if(text.equalsIgnoreCase("18")) {
						        	
						        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).click();
						       break;
						        }
						        	
						        } 
						        
						        PageBase.wait(3);
						        
	/*	log.info("cancel");	
		obj.cancelSave_method();
		log.info("vacation canceled"); */
		
		log.info("save");				        
		obj.save_zone_vacation_method();
		PageBase.wait(6);
		
		log.info("open heapmap page");
		obj.heapMenu_method();
		PageBase.wait(10);
		
		log.info("click on logical zone");
		obj.zone1_method();
		PageBase.wait(20);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");


		
		
		
	}
	
}
	
	
	


