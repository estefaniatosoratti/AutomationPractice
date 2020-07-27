package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageWomen {
	private WebDriver driver;
	private By labelFirstList;
	
	public PageWomen(WebDriver driver) {
		this.driver = driver;
		labelFirstList = By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img");
	}
	
	public void clickOption(String linkText) {
		driver.findElement(By.linkText(linkText));
	}
	
	public String getFirstResult() {
		return driver.findElement(labelFirstList).getText();
	}
}
