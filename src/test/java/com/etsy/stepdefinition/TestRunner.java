package com.etsy.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/AddToCart.feature",tags= {},
monochrome=true,glue="com.etsy.stepdefinition",dryRun=false,
plugin= {"html:target"})

public class TestRunner {

}
