package sanitySuite;


import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.PageBase;
import base.TestBase;
import javafx.scene.control.DatePicker;
import pages.Syn_google_search;



@Test
public class TestCase_1_GoogleSearch extends TestBase{

	Syn_google_search obj_google_search;
	
	


	public void open_url() {

		log.info("Open Building Site URL.");
		driver.get(data.getProperty("base.url"));
		PageBase.wait(5);
		log.info("email page");
		obj_google_search = new Syn_google_search (driver);
		obj_google_search.emailId_method();
		log.info("submit");
		obj_google_search.emailNext_method();
		log.info("Password");
		obj_google_search.passWord_method();
		log.info("submmit");
		obj_google_search.submmit_method();
		PageBase.wait(4);
	/*	log.info("logout");
		obj_google_search.logOut_method(); */
		log.info("select building");
		obj_google_search.buildingSelect_method();
		PageBase.wait(30);
		log.info("select buildingMenu");
		obj_google_search.buildingMenu_method();
		PageBase.wait(6);
		
		WebElement table = driver.findElement(By.xpath("//div[@class='fs-vacations__body']/table/tbody"));
		String c= table.getText();
		//System.out.println(c);
		List<WebElement> rowNumberList = table.findElements(By.tagName("tr"));
		int rowSize= rowNumberList.size();
		System.out.println("Row Size" +rowSize);
		for(int i=1; i<=rowSize; i++) {
			String value= driver.findElement(By.xpath("//div[@class='fs-vacations__body']/table/tbody[1]/tr["+i+"]/td[2]")).getText();
			System.out.println(value);
			if(value.equals("13 Aug 20")) {
				System.out.println("Value found is " + value);
				driver.findElement(By.xpath("//div[@class='fs-vacations__body']/table/tbody/tr["+i+"]/td[5]")).click();
			log.info("delete Vacation");
				PageBase.wait(2);
				driver.findElement(By.className("confirmation-dialog__buttongroup__ok")).click();
			log.info("dialog OK");
				break;
			}
		}
			
		log.info("Vaction Addition");
		obj_google_search.addVacation_method();
		log.info("Vacation Name");
        obj_google_search.vactionName_method();
        PageBase.wait(3);
        log.info("Calendar");
    //    DatePicker obj1 = new DatePicker();
    //    obj1.calendar_method();
  ///      PageBase.wait(3);
    //    obj_google_search.vacationSave_method();
    //    log.info("Vacation Save"); 
        
        
      //  obj_google_search.start_method();
   //  PageBase.wait(2);
    String month=  driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
     	
		System.out.println(month);
		
	while (!month.contains("AUGUST 2020")) { 
			System.out.println(month);
			 driver.findElement(By.xpath("//th[@class='next available ng-star-inserted']")).click();
			month = driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
		}
		
		month = driver.findElement(By.xpath("//th[@class='month drp-animate']")).getText();
		System.out.println(month);
		PageBase.wait(3);
		
 /*		List<WebElement> date1 = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]"));
	       int count=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).size();
	        
	        for (int i=0; i<count; i++) {
	        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).get(i).getText();
	        System.out.println(text);
	        if(text.equalsIgnoreCase("13")) {
	        	
	        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).get(i).click();
	       break;
	        }
	        	
	        } 
	        
	        PageBase.wait(3); */
	        
	   List<WebElement> dateAv = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]"));
		       int countAv=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).size();
		        
		        for (int i=0; i<countAv; i++) {
		        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).getText();
		        System.out.println(text);
		        if(text.equalsIgnoreCase("13")) {
		        	
		        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available')]")).get(i).click();
		       break;
		        }
		        	
		        } 
		        
		        PageBase.wait(3);
	
    // end date
	        
	        String month1=  driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
	     	
			System.out.println(month1);
			
			while (!month1.contains("AUGUST 2020")) {
				System.out.println(month1);
				 driver.findElement(By.xpath("//th[@class='next available ng-star-inserted']")).click();
				month1 = driver.findElement(By.cssSelector("[class='month drp-animate']")).getText();
			}
			
			month1 = driver.findElement(By.xpath("//th[@class='month drp-animate']")).getText();
			System.out.println(month1);
			PageBase.wait(3);
			
			List<WebElement> date2 = driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]"));
		       int count1=driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).size();
		        
		        for (int i=0; i<count1; i++) {
		        String text= driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).get(i).getText();
		        if(text.equalsIgnoreCase("14")) {
		        	
		        	driver.findElements(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody/tr/td[contains(@class,'available ng-star-inserted')]")).get(i).click();
		       break;
		        }
		        	
		        } 
		        
		        PageBase.wait(3);
		        
		        obj_google_search.vacationSave_method();
		        log.info("Vacation Save");
		        
		
	/*	WebElement date =driver.findElement(By.xpath("//div[@class='calendar left ng-star-inserted']/div/table/tbody"));
		List<WebElement> rows=date.findElements(By.tagName("tr"));  
	      List<WebElement> columns=date.findElements(By.tagName("td"));

	      System.out.println("Rows count :" + rows.size());
	      System.out.println("Column count :" + columns.size());

	      for (WebElement cell: columns)
	      {  
	    	  System.out.println(cell);
	          //Select 13th Date   sy
	          if (cell.getText().equals("13"))
	          {  
	              cell.findElement(By.linkText("13")).click();  
	              break;  
	          }  
	      }
		
	
        
     
/*List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
for (WebElement cell: columns) {
		
		if (cell.getText().equals(today available)) {
            cell.click();
            break;
		
	}
	
} */
       /* log.info("Save");
		obj_google_search.vacationSave_method(); */
		
		/*WebElement mouse = driver.findElement(By.xpath("//i[@class='fas fa-building']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		obj_google_search.buildingMenu_method();
		actions.moveToElement(subMenu);
		actions.click().build().perform();*/
		

		/*log.info("Mobile page");
		obj_google_search = new Syn_google_search (driver);
		obj_google_search.openPage_method();
		//PageBase.wait(2);
		obj_google_search.mobilesOnPlan_method();
		log.info("Mobile  end");
		obj_google_search.mobileNext_method();
		log.info("nextStep");
		obj_google_search.mobileMoto_method();
		log.info("Moto info"); */
		
		//obj_google_search.search_by_first_option(data.getProperty("TestCase_1.searchString_1"));
		//log.info("Assert actual searched string with expected string from properties file.");
		//assertStrings(obj_google_search.get_first_option(),data.getProperty("TestCase_1.assertString_1"));
		//Assert.assertTrue(obj_google_search.get_first_option().equals(getPropertyValue("TestCase_1.assertString_1"))); */

	} 
	
/*
	@Test (priority=2, description = "Click on first search option")	
	public void click_first_search_option() {

		log.info("Click on first search option");
		obj_google_search.click_on_first_search_option();

	}
*/
	
}




