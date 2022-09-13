package org.facebook.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
                  glue="org.facebook.stepdefinition",
                   plugin="html:target",
                   monochrome=true,
                   dryRun=false)

public class TestRunner {

}
