package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("001");
		driver.findElement(By.name("phoneNumber")).sendKeys("9500339662");
		driver.findElement(By.xpath("//em[@unselectable='on']/button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		WebElement leadId = driver.findElement(By.xpath("(//div[@unselectable='on']/a[@class='linktext'])[1]"));
		String text = leadId.getText();
		System.out.println(text);
		leadId.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text2);
		driver.close();
	}

}
