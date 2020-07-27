package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PageIndex;
import pages.PageWomen;

public class VerifyFirstResult {
	private WebDriver driver;
	private PageIndex pIndex;
	private PageWomen pWomen;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		pIndex = new PageIndex(driver);
		pWomen = new PageWomen(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void firstResultTops() {
		pIndex.clickWomen();
		pWomen.clickOption("TOPS");
		Assert.assertEquals(pWomen.getFirstResult(), "Faded Short Sleeve T-shirts");
	}
	
	@Test
	public void firstResultDresses() {
		pIndex.clickWomen();
		pWomen.clickOption("DRESSES");
		Assert.assertEquals(pWomen.getFirstResult(), "Printed Dress");
	}
	
}
