package com.def.stepdefs.combined;

import com.demo.func.Calculator;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FloatStepDefinitions {
	Calculator obj;

	@Given("^I have been given with (\\d+.\\d+) (\\d+.\\d+)$")
	public void i_have_been_given_with(float arg1, float arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I ask calcl to do \"([^\"]*)\"$")
	public void i_ask_calcl_to_do(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^it should give me the result (\\d+.\\d+)$")
	public void it_should_give_me_the_result(float arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

}
