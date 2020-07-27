package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageIndex {
	private WebDriver driver;
	private By womenLink;
	
	public PageIndex(WebDriver driver) {
		this.driver = driver;
		womenLink = By.linkText("WOMEN");
	}
	
	public void clickWomen() {
		driver.findElement(womenLink);
	}
}
