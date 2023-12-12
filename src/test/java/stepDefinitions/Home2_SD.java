package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;

public class Home2_SD extends DriverFactory{
homePage home2= new homePage();
//homePageLaunch
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		String strUrl = driver.getCurrentUrl();

		if (strUrl.equals(url)) {
			System.out.println("They're equal"); 
		}

		else 
			System.out.println("They're not equal"); 
	}
	

	@When("user give the correct URL \\(https:\\/\\/rahulshettyacademy.com\\/angularpractice\\/")
	public void user_give_the_correct_url_https_rahulshettyacademy_com_angularpractice() {
	  
		String strUrl = driver.getCurrentUrl();

		if (strUrl.equals(url)) {
			System.out.println("They're equal"); 
		}

		else 
			System.out.println("They're not equal"); 
	}

	@Then("User should land on homepage")
	public void user_should_land_on_homepage() {
	   
		home2.verifyHomePage();
	}

	@When("user give the invalid URL \\(https:\\/\\/rahulshettyacademy.com\\/angular")
	public void user_give_the_invalid_url_https_rahulshettyacademy_com_angular() {
		home2.verifyLink(url);
		}


	@Then("User should receive {int} not found error")
	public void user_should_receive_not_found_error(Integer int1) {
	   
		home2.verifyLink(url);
	}


	//homePge title and footer
	@Given("User is at the Protocommerce Homepage")
	public void user_is_at_the_protocommerce_homepage() {
	    
		 
		home2.verifyHomePage();
	}

	@When("User is on Homepage")
	public void user_is_on_homepage() {
		 
		home2.verifyHomePage();
	}

	@Then("User should see {string} as title")
	public void user_should_see_as_title(String string) {
		home2.verifyHomePage();
	}

	@Given("User is on  Protocommerce Homepage")
	public void user_is_on_protocommerce_homepage() {
		home2.verifyHomePage();
	}

	@When("User is at the Homepage")
	public void user_is_at_the_homepage() {
	    
	}

	@Then("User should see the footer as {string}")
	public void user_should_see_the_footer_as(String string) {
	   
	}

	//homepage gender verification
	
	@Given("User is on the Protocommerce Homepage")
	public void user_is_on_the_protocommerce_homepage() {
	    
	}

	@When("User can see options for select {string}")
	public void user_can_see_options_for_select(String string) {
	   
	}

	@Then("The gender should be {string} as default")
	public void the_gender_should_be_as_default(String string) {
	   
	}

	@When("The user click on gender dropdown {string} in homepage")
	public void the_user_click_on_gender_dropdown_in_homepage(String string) {
	    
	}

	@Then("it should be set to corresponding gender")
	public void it_should_be_set_to_corresponding_gender() {
	   
	}
	
	//Homepage Employment status
	
	
	@When("User is at Homepage")
	public void user_is_at_homepage() {
	   
	}

	@Then("None of the employment status radio button should be selected and the {string} radio button should be disabled")
	public void none_of_the_employment_status_radio_button_should_be_selected_and_the_radio_button_should_be_disabled(String string) {
	    
	}

	@When("User select the {string} radio button")
	public void user_select_the_radio_button(String string) {
	   
	}

	@Then("The {string} radio button should be selected")
	public void the_radio_button_should_be_selected(String string) {
	    
	}

	@When("User attempt to select the {string} radio button")
	public void user_attempt_to_select_the_radio_button(String string) {
	    
	}

	@Then("The {string} radio button should remain disabled")
	public void the_radio_button_should_remain_disabled(String string) {
	  
	}

	//Homepage Date of Birth verification
	
	@When("User is on the Homepage")
	public void user_is_on_the_homepage() {
	    
	}

	@Then("User should see a text box with default mm\\/dd\\/yyyy and date picker icon")
	public void user_should_see_a_text_box_with_default_mm_dd_yyyy_and_date_picker_icon() {
	   
	}

	@When("User enter valid date of birth in the text box")
	public void user_enter_valid_date_of_birth_in_the_text_box() {
	    
	}

	@Then("The entered date should be displayed in the text box")
	public void the_entered_date_should_be_displayed_in_the_text_box() {
	    
	}

	@When("User enter invalid date of birth in the text box")
	public void user_enter_invalid_date_of_birth_in_the_text_box() {
	    
	}

	@Then("An error message should be displayed indicating an invalid date format")
	public void an_error_message_should_be_displayed_indicating_an_invalid_date_format() {
	   
	}

	@When("User click on the date picker icon and select the date")
	public void user_click_on_the_date_picker_icon_and_select_the_date() {
	    
	}

	@Then("The selected date should be displayed in the text box")
	public void the_selected_date_should_be_displayed_in_the_text_box() {
	  
	}

	
	
}
