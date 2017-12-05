package tech.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPage{

	private static final String SELENIUM_WEB_PAGE = "http://www.seleniumhq.org/";
	private String seleniumLink = "#rso > div:nth-child(1) > div > div > div > div > h3 > a";

	public SeleniumPage() {
		super();
	}

	WebDriver driver;
	
    public SeleniumPage(WebDriver driver) {
    	this.driver = driver;
    }

	@SuppressWarnings("finally")
	public boolean isTextPresent(String txtValue){
        boolean b = false;
    try{
        b = driver.getPageSource().contains(txtValue);
        return b;
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }     
    finally{
     return b;
    }
}
	public WebElement findElementByCss(String selector){
		return driver.findElement(By.cssSelector(selector));
	}
	
	public void clickOnLink(WebElement linkElement){
		Actions action= new Actions(driver);
		
		action.contextClick(linkElement).sendKeys(Keys.ENTER).build().perform();		
	}

	public void clickOnSeleniumLink(){
		clickOnLink(findElementByCss(seleniumLink));		
	}

	public boolean isURLSuccess() {
		  
		 return driver.getCurrentUrl().equalsIgnoreCase(SELENIUM_WEB_PAGE);
		}
	
}