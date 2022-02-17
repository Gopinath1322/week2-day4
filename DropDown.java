package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement DropDown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select index=new Select(DropDown1);
		index.selectByIndex(1);
		WebElement DropDown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select text=new Select(DropDown2);
		text.selectByVisibleText("Selenium");
		WebElement DropDown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select value=new Select(DropDown3);
		value.selectByValue("1");
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
		//WebElement DropDown4 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		//Select option=new Select(DropDown4);
		//option.se
		//WebElement DropDown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		//Select index=new Select(DropDown1);
		//index.selectByIndex(1)
		//WebElement DropDown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		//Select index=new Select(DropDown1);
		//index.selectByIndex(1)
	}

}
