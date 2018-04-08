package com.def.stepdefs.combined;

import static org.junit.Assert.assertEquals;

import com.demo.func.Calculator;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CombinedStepDefinitions {

	Calculator obj;
	int result;

	@Given("^I have been given a calc with  (\\d+) (\\d+)$")
	public void i_have_been_given_a_calc_with(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		obj = new Calculator(arg1, arg2);
	}

	@When("^I ask calc to do \"([^\"]*)\"$")
	public void i_ask_calc_to_do(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equalsIgnoreCase("add")) {
			result = obj.add();
		} else if (arg1.equalsIgnoreCase("subtract")) {
			result = obj.subtract();
		}
	}

	@Then("^it should give me with result (\\d+) of \"([^\"]*)\"$")
	public void it_should_give_me_with_result_of(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		if(arg2.equalsIgnoreCase("negative")) {
			result=(-1) * result;
		}
		assertEquals(arg1, result);
	}

}
