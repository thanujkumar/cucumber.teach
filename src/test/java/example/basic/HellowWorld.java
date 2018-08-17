package example.basic;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HellowWorld {

    @Given("^Application is run$")
    public void applicationIsRun() throws Throwable {
        System.out.println("Hello World example is about to run");
    }

    @Then("^Greet with hello world$")
    public void greetWithHelloWorld() throws Throwable {
        System.out.println("Hello World!");
    }
}
