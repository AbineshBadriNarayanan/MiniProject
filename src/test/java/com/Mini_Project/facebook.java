package com.Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Mini_Project\\Driver\\chromedriver.exe");
   WebDriver mav= new ChromeDriver();
   mav.get("https://www.facebook.com/");
     mav.manage().window().maximize();
     
     mav.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("logo12345@gmail.com");
     
     mav.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
     Thread.sleep(2000);
     
     mav.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(2000);
     
     
         
	}

	
}
