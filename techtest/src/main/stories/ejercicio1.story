
Meta:
@page googlePage, sleniumPage

Scenario:  

Given I want to go to the www.seleniumhq.org Page
When I go to www.google.com
And I type Seleniumhq in the searchbox
And I press ENTER in the searchbox
And I click on Selenium HQ link
Then I'm on Selenium HQ Page