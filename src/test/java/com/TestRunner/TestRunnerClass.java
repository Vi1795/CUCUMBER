package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features ={"FeatureFiles/loginfile.feature"},
	glue= {"com.StepDefination"},
	monochrome=true,
	dryRun=false,
	plugin= {"html:Reports/loginpage.html",
			"json:Reports/loginpage.json",
			"junit:Reports/loginpage.xml"}
	
)
public class TestRunnerClass extends AbstractTestNGCucumberTests{

	
}
