package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchSteps extends ApplicationPageBase {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);



    @Given("^User must be in home page$")
    public void user_must_be_in_home_page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"My Store");
        System.out.println("User in Home Page");
    }

    @When("^User search items using search box$")
    public void user_search_items_using_search_box()  {
        homePage.search("books");
    }

    @Then("^Related items should be on the screen$")
    public void related_items_should_be_on_the_screen() {
        String actualText = homePage.getTextForIrreleventItemsSearch();
        Assert.assertEquals(actualText, "No results were found for your search \"books\"");
    }
}
