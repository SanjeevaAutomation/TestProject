package TestPakage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Example1 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
System.setProperty("webdriver.firefox.bin","C:\\Users\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("");
		
		String rowData = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();
		System.out.println("data of row data : "+rowData);
		driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[]"));
		System.out.println("data of row is : "+rowData);
		
	}

}
