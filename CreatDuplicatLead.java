package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatDuplicatLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gopin9353@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement leadname = driver.findElement(By.xpath("//a[text()='Gopinath']"));
		String text = leadname.getText();
		System.out.println(text);
		leadname.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		WebElement duplicatename = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String text2 = duplicatename.getText();
		if(text.equals(text2))
			System.out.println("same");
		else
			System.out.println("not same");
		driver.close();
	}

}
