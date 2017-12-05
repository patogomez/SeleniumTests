package tech.test.steps;

import tech.test.pages.*;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.jbehave.core.steps.Steps;

public class SeleniumSteps extends Steps{

	@Autowired
	private PageFactory pageFactory;
    private GooglePage googlePage;
    private SeleniumPage seleniumPage;
    
    @Given("I go to $webpage")
    public void goToGooglePage(String webpage) {
    	googlePage.go(webpage);
    }

    @When("I type $searchword in the searchbox")
    public void fillSearchBox(String searchword){
    	googlePage.fillSearchBox(searchword);
    }
    
    @When("I press ENTER in the searchbox")
    public void pressEnterOnSearchbox(){
    	googlePage.pressEnterOnSearchBox();
    }
    
    @When("I click on Selenium HQ link")
    public void clickOnSeleniumLink(){
    	seleniumPage.clickOnSeleniumLink();
    }
    
    @Then("I'm on Selenium HQ Page")
    public void verifySuccessPage(){
    	Assert.assertTrue(seleniumPage.isURLSuccess());
    }

	public void setPageFactory(PageFactory pageFactory) {
		this.pageFactory = pageFactory;
	}
    
    
  }
