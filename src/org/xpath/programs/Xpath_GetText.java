package org.xpath.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_GetText {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Project Class Tasks\\xPath_03_04_2019\\Xpath_Proj\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		String str1 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[1]/div/h4[1]/b")).getText();
		String str2 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[2]/div/h4[1]/b")).getText();
		String str3 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[3]/div/h4[1]/b")).getText();
		String str4 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[4]/div/h4[1]/b")).getText();
		String str5 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[3]/div/h4[2]/b")).getText();
		String str6 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[1]/div/h4[2]/b")).getText();
		String str7 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[2]/div/h4[2]/b")).getText();
		String str8 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[4]/div/h4[2]/b")).getText();
		String str9 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[2]/div/h4[3]/b")).getText();
		String str10 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[3]/div/h4[3]/b")).getText();
		String str11 = driver.findElement(By.xpath("/html/body//div/div/div/div/div/div/div[2]/div[1]/div/h4[3]/b")).getText();
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
		System.out.println(str9);
		System.out.println(str10);
		System.out.println(str11);
		
		
	}

}
