package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gopinath");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		WebElement companyname = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		String text = companyname.getText();
		companyname.clear();
		companyname.sendKeys("Gopi Pvt.limited");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		WebElement newname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text2 = newname.getText();
		if(text.equals(text2))
			System.out.println("same");
		else
			System.out.println("not same");
}
}