package test_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource/Features"},
		glue = {"step_definitions", "AppHooks"},
		plugin = {"pretty"
				}
		)

public class Test_Runner {

}
