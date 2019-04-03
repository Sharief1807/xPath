package org.xpath.programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_etText_En_ForLoop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Project Class Tasks\\xPath_03_04_2019\\Xpath_Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com");
		List<WebElement> topics = driver.findElements(By.xpath("//div [@class='row featured-boxes']//b"));
		for (WebElement string : topics) {
			System.out.println(string.getText());
		}

	}

}
