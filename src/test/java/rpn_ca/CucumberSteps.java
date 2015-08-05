package rpn_ca;

import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CucumberSteps extends TestCase{
	
	
	Calculator cal= new Calculator();
	String input;
	@Given("^the inputs \"([^\"]*)\"$")
	public void the_inputs(String arg1) throws Throwable {
		this.input=arg1;
	}

	@Then("^system should display a message \"([^\"]*)\"$")
	public void system_should_display_a_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		assertEquals(Float.parseFloat(arg1),cal.eval(input));
	}

}
