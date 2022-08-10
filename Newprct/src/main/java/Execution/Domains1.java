package Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Domains1 {
	@Given("the user has logged in successfully")
	public void the_user_has_logged_in_successfully() {
		System.out.println("Step1");
	}

	@Then("user verifies for the active order")
	public void user_verifies_for_the_active_order() {
		System.out.println("Step2");
	    
	}

	@When("User clicks cancel order")
	public void user_clicks_cancel_order() {
		System.out.println("Step3");
	    
	}

	@And("user logout from the application")
	public void user_logout_from_the_application() {
		System.out.println("Step4");
	   
	}

	@Then("user places another order")
	public void user_places_another_order() {
		System.out.println("Step5");
	    
	}


}
