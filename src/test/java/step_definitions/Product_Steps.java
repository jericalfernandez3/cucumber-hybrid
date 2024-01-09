package step_definitions;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.Product_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_Steps {

	private Product_Page productPage = new Product_Page(DriverFactory.getDriver());
	
	@Then("user should be redirected to Product Page")
	public void username_successfully_logged_in() throws InterruptedException {
		Assert.assertTrue(productPage.is_inventory_container_exist());
	}
	
}
