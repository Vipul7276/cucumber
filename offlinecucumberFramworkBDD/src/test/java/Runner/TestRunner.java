package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\eclipse-jee-neon-3-win32-x86_64\\SELENIUM\\cucumberFramworkBDD\\src\\main\\java\\Feature\\Login.feature"//path of the feature file
		,glue={"StepDefination"},// path of stepdefination file
		format={"pretty","html:test-outpute","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},// to generate different type of reporting file
		monochrome=true,//the display the console output in a proper readable format  
		strict=true,// strictly check the all test cases are same or not..feature file=stepdefination file..if it is not match then exception occurs 
		dryRun=false  // if dryRun is true its check feature file and stepdefination files contain same or not. but can not run project.....if druRun is false then run project 
		)





public class TestRunner {

}
