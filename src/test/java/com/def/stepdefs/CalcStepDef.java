package com.def.stepdefs;

import static org.junit.Assert.assertEquals;

import com.demo.func.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcStepDef {

	Calculator objCalc;
	int result;

	@Given("^I have a calc with (\\d+) (\\d+)$")
	public void i_have_a_calc_with(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		objCalc = new Calculator(arg1, arg2);
		result=0;
	}

	@When("^I ask it to say add$")
	public void i_ask_it_to_say_add() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		result = objCalc.add();
	}

	@Then("^it should answer with add (\\d+)$")
	public void it_should_answer_with_add(int expectedResult) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		assertEquals(expectedResult, result);
	}

	@When("^I ask it to say subtract$")
	public void i_ask_it_to_say_subtract() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		result = objCalc.subtract();
	}

	@Then("^it should answer with sub (\\d+)$")
	public void it_should_answer_with_sub(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		assertEquals(arg1, result);
	}

	@When("^I ask it to say multiply$")
	public void i_ask_it_to_say_multiply() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		result = objCalc.multiply();
	}

	@Then("^it should answer with mul (\\d+)$")
	public void it_should_answer_with_mul(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		assertEquals(arg1, result);
	}

	@When("^I ask it to say divide$")
	public void i_ask_it_to_say_divide() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		result=objCalc.divison();
	}

	@Then("^it should answer with div (\\d+)$")
	public void it_should_answer_with_div(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		assertEquals(arg1, result);
	}

}
