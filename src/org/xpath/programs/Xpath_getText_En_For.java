package org.xpath.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_getText_En_For {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Project Class Tasks\\xPath_03_04_2019\\Xpath_Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com");
		System.out.println("SubTopics under Testing : ");
		List<WebElement> e1 = driver.findElements(By.xpath("(//ul[@id='java_technologies'])[1]//a"));
		for (WebElement string : e1) {
			System.out.println(string.getText());
		}
		System.out.println("SubTopics under Big data : ");
		List<WebElement> e2 = driver.findElements(By.xpath("(//ul[@id='java_technologies'])[10]//a"));
		for (WebElement string : e2) {
			System.out.println(string.getText());
		}

	}
}
