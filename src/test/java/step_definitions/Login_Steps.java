package step_definitions;
import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.Product_Page;
import com.pages.Login_Page;

import io.cucumber.java.en.*;

public class Login_Steps {
	
	private static String title;
	private Login_Page loginPage = new Login_Page(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/v1/index.html");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getTitlePage();
	}

	@Then("the title should be {string}")
	public void the_title_should_be(String pageTitle) {
		Assert.assertTrue(title.contains(title));
	}

	@Then("username and password textfield should be displayed")
	public void username_and_password_textfield_should_be_displayed() {
	    Assert.assertTrue(loginPage.is_username_field_exist());
	    Assert.assertTrue(loginPage.is_password_field_exist());
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enter_username(username);
	}
	
	@And("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enter_password(password);
	}
	
	@And("user clicks login button")
	public void user_clicks_login_button() {
		loginPage.click_login_button();
	}

}
