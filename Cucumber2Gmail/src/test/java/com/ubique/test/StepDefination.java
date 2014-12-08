package com.ubique.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Loigin")
public class StepDefination extends AbstractTestNGCucumberTests{

}
//,format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},tags = {"@run"}