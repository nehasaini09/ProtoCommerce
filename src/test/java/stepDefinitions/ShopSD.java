package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Shop1Object;

public class ShopSD extends DriverFactory {
	
	private Shop1Object shop1 = new Shop1Object();
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		shop1.verifyHomePage();
	   
	}

	@When("User clicks on shop button")
	public void user_clicks_on_shop_button() {
		shop1.validatingShopBtn();
	    
	}

	@Then("User should be on shopping page")
	public void user_should_be_on_shopping_page() {
		shop1.verifyHomePage();
	   
	}

	@Then("User should get an error message: button not clickable")
	public void user_should_get_an_error_message_button_not_clickable() {
	   System.out.println("Error: Button not clickable");
	}
	
	
	
	
	//**********************************2Feature****************************
	@Given("User is on shopping page")
	public void user_is_on_shopping_page() {
		shop1.verifyShopPage();
	    
	}

	@When("User clicks on ProtoCommerce Title")
	public void user_clicks_on_proto_commerce_title() {
		shop1.verifyProtoComm();
	    
	}

	@Then("User should be on home page")
	public void user_should_be_on_home_page() {
		shop1.verifyHomePage();
	    
	}

	@When("User clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
	   shop1.clickOnChkBtn();
	}

	@Then("User should be on checkout page")
	public void user_should_be_on_checkout_page() {
	    shop1.verifyCheckoutPage();
	}

	@Then("User get an error msg: button not clickable")
	public void user_get_an_error_msg_button_not_clickable() {
	   System.out.println("Error");
	}

	//********************************Feature 3*************************************
	
	@Then("User should see a heading: Shop Title")
	public void user_should_see_a_heading_shop_title() {
		
		
	}

	@Then("User not able to see heading")
	public void user_not_able_to_see_heading() {
	    
	}
	
	
	//******************************Feature 4********************************8
	
	@When("User clicks on category1 button")
	public void user_clicks_on_category1_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on category2 button")
	public void user_clicks_on_category2_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on category3 button")
	public void user_clicks_on_category3_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
//*****************************Feature 5**************************************************
	
	@When("User clicks on next image button")
	public void user_clicks_on_next_image_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see next image")
	public void user_should_see_next_image() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on previous image button")
	public void user_clicks_on_previous_image_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see previous image")
	public void user_should_see_previous_image() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
//********************************************Feature 6*************************************
	
	@When("User clicks on iphone X add button")
	public void user_clicks_on_iphone_x_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see product added to checkout button")
	public void user_should_see_product_added_to_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Samsung add button")
	public void user_clicks_on_samsung_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Nokia add button")
	public void user_clicks_on_nokia_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Blackberry add button")
	public void user_clicks_on_blackberry_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//*******************************Feature 7************************************
	
	@When("User clicks on iphone image")
	public void user_clicks_on_iphone_image() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User get an error msg: Image not clickable")
	public void user_get_an_error_msg_image_not_clickable() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Samsung image")
	public void user_clicks_on_samsung_image() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Nokia image")
	public void user_clicks_on_nokia_image() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Blackberry image")
	public void user_clicks_on_blackberry_image() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	//***********************************Feature 8******************************************************
	
	
	@When("User clicks on iphone text")
	public void user_clicks_on_iphone_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Samsung text")
	public void user_clicks_on_samsung_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Nokia text")
	public void user_clicks_on_nokia_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Blackberry text")
	public void user_clicks_on_blackberry_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	
	

}
