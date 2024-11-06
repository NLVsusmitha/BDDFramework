package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features" ,
                                       glue="steps",
                                       tags=" @wip0411b",
                                       stepNotifications=true,
                                       dryRun=false
                                       )
public class RegRunner {
	
	

}
