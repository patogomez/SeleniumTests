package tech.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage{

	private static final String SEARCH_WORD_SELECTOR = "#lst-ib";

	public GooglePage() {
		super();
	}

	WebDriver driver;
	
    public GooglePage(WebDriver driver) {
    	this.driver = driver;
    }

	public void go(String webpage) {
		driver.get(webpage);
	}
	
	WebElement searchBoxElement = driver.findElement(By.cssSelector(SEARCH_WORD_SELECTOR));
    
	public void fillSearchBox(String searchword){
    	searchBoxElement.sendKeys(searchword);
    }
 
	public void pressEnterOnSearchBox() {
		searchBoxElement.sendKeys(Keys.ENTER);
	}
	
	public WebElement findElementByCss(String selector){
		return driver.findElement(By.cssSelector(selector));
	}
	
	



	
}