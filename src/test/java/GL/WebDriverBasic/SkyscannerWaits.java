package GL.WebDriverBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyscannerWaits {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sdp\\Sky\\WebDriverBasic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skyscanner.pl/");
		
		driver.findElement(By.xpath("//input[@id='fsc-origin-search']")).sendKeys("Warszawa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fsc-destination-search']")).sendKeys(" Berlin");
		//driver.findElement(By.xpath("//li[@id='react-autowhatever-fsc-destination-search--item-0']//div[@class='BpkAutosuggest_bpk-autosuggest__suggestion-inner__3q0Fn']"));
		Thread.sleep(2000);
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[4]//td[5]//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("return-fsc-datepicker-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='BpkCalendarDate_bpk-calendar-date__3VYKN']//span[contains(text(),'30')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CabinClassTravellersSelector_fsc-class-travellers-trigger__18yAY")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='search-controls-cabin-class-dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Pierwsza klasa')]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='BpkLink_bpk-link__2e_PE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='originFlexible']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='destinationFlexible']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='BpkButton_bpk-button__12Eue BpkButton_bpk-button--large__2SwK9 App_SubmitButton__1EUd0']")).click();
		
		Thread.sleep(1000);
		
		WebElement flight = driver.findElement(By.cssSelector("div.day-list-container li"));
		
		flight.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
