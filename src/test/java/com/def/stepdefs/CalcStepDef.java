package com.def.stepdefs;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;

import com.demo.func.Calculator;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;

public class CalcStepDef {

	Calculator objCalc;
	int result;
	
	 private static Logger log = Logger.getLogger(CalcStepDef.class.getName());//

	@Given("^I have a calc with (\\d+) (\\d+)$")
	public void i_have_a_calc_with(int arg1, int arg2) throws Throwable {
	
		objCalc = new Calculator(arg1, arg2);
		result = 0;
	}

	@When("^I ask it to say add$")
	public void i_ask_it_to_say_add() throws Throwable {
		result = objCalc.add();
	}

	@Then("^it should answer with add (\\d+)$")
	public void it_should_answer_with_add(int expectedResult) throws Throwable {
		assertEquals(expectedResult, result);
	}

	@When("^I ask it to say subtract$")
	public void i_ask_it_to_say_subtract() throws Throwable {
		result = objCalc.subtract();
	}

	@Then("^it should answer with sub (\\d+)$")
	public void it_should_answer_with_sub(int arg1) throws Throwable {
		assertEquals(arg1, result);
		Thread.sleep(5000);
	}

	@When("^I ask it to say multiply$")
	public void i_ask_it_to_say_multiply() throws Throwable {
		result = objCalc.multiply();
	}

	@Then("^it should answer with mul (\\d+)$")
	public void it_should_answer_with_mul(int arg1) throws Throwable {
		assertEquals(arg1, result);
	}

	@When("^I ask it to say divide$")
	public void i_ask_it_to_say_divide() throws Throwable {
		result = objCalc.divison();
	}

	@Then("^it should answer with div (\\d+)$")
	public void it_should_answer_with_div(int arg1) throws Throwable {
		assertEquals(arg1, result);
	}

	@Given("^I have a calc with$")
	public void i_have_a_calc_with(DataTable dt) throws Throwable {
		List<DataTableRow> rows = dt.getGherkinRows();
		for (DataTableRow row : rows) {
			String arg1 = row.getCells().get(0);
			String arg2 = row.getCells().get(1);
			objCalc = new Calculator(Integer.parseInt(arg1), Integer.parseInt(arg2));

		}
	}

	@Before
	public void setup() {
		System.out.println("This will run before the Scenario");
	}

	@After("@addtag")
	public void cleanup() {
		System.out.println("This will run after the Scenario");
	}

}
