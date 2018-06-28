package com.time.catw;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Timesheet
{  
	public static void main(String[] args) throws InterruptedException 
	{
		/*System.setProperty("webdriver.chrome.driver","C:/Chromedriver_new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.ie.driver", "C:\\All Tools\\jar_files\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		
       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://pj1.sapnet.entsvcs.net/hps-ic");
		
		Thread.sleep(1000);
		try
		{
			Runtime.getRuntime().exec("C:/AA/WorkSpace_FLY/basicauth.exe");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Thread.sleep(10000);
		
		driver.findElement(By.id("sap-user")).sendKeys("60032691");
		driver.findElement(By.id("sap-password")).sendKeys("June@2018");
		driver.findElement(By.className("urBtnCntTxt")).click();

	
		
//		driver.findElement(By.xpath("//*[@id='time_entry']/nobr/span")).click();   
//	 driver.findElement(By.xpath("//div[@class=urTreNl2 ']/span[@class='urTxtStd']")).click();
	// driver.findElement(By.id("//*[@id='time_entry']/span[@class='urTxtStd']")).click();
	
/*
	   
	      String href=" ";
	     List<WebElement> anchors = driver.findElements(By.tagName("a"));
	        Iterator<WebElement> i = anchors.iterator();
		    

	        while(i.hasNext()) {
	            WebElement anchor = i.next();
	            if(anchor.getAttribute("href").contains(href)) {
	                anchor.click();
	                break;	        
	            }  
	
}*/
		/*WebElement timeEntry = driver.findElement(By.id("time_entry")).click();
		Actions builder = new Actions(driver); // Move cursor to the Main Menu Element 
		builder.moveToElement(timeEntry).Perform(); // Giving 5 Secs for submenu to be displayed 
		Thread.sleep(5000L); // Clicking on the Hidden SubMenu driver.findElement(By.Id("sbEle")).click();
		*/
/*		
		List<WebElement> elems = driver.findElements(By.xpath("//*[@id='myTreetime_entry']/table/tbody/tr"));
        for (WebElement rowElem : elems) 
        {
            List<WebElement> cells =rowElem.findElements(By.xpath("//*[@id='myTreetime_entry-cnt-start']"));

            if(cells.get(0).getText().equalsIgnoreCase("Time Entry"))
            {

              System.out.println(cells.get(0).getText());//
              cells.get(0).click();   

            }
}*/
		
		// driver.findElement(By.xpath("//*[@id='time_entry']/nobr/span[@class='urTxtStd']")).click();
		  driver.findElement(By.xpath("//table/tbody/tr/td/a[@id='time_entry']")).click();
		  System.out.println("Clicked");
		
	}
}
