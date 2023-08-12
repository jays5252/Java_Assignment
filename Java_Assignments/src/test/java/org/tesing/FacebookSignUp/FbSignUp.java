package org.tesing.FacebookSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp 
{
	public void LunchChrome() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "../practice/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement CreateNewAccountButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		CreateNewAccountButton.click();
		Thread.sleep(5000);
		
		WebElement fName = driver.findElement(By.name("firstname"));
		fName.sendKeys("Jay");
		
		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys("lastname");
		
		WebElement emailField = driver.findElement(By.name("reg_email__"));
		emailField.sendKeys("dummyjay@gmail.com");
		
		WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmEmail.sendKeys("dummyjay@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("1234567890");
		
		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select sDay = new Select(bday);
		sDay.selectByVisibleText("19");
		
		WebElement bMonth = driver.findElement(By.name("birthday_month"));
		Select sMonth = new Select(bMonth);
		sMonth.selectByIndex(8);
		
		WebElement bYear = driver.findElement(By.name("birthday_year"));
		Select sYear = new Select(bYear);
		sYear.selectByVisibleText("1993");
		
		WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']"));
		genderMale.click();
		
		WebElement SignUpButton = driver.findElement(By.name("websubmit"));
		SignUpButton.click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		FbSignUp lb = new FbSignUp();
		lb.LunchChrome();
	}


}
