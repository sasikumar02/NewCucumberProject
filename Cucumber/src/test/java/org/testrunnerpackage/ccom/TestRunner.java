package org.testrunnerpackage.ccom;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = "org.stepdefinition",dryRun = false,monochrome = true,
plugin= {"pretty","json:src\\test\\resources\\Reports\\fb.json"},tags = {"@sanity"})

public class TestRunner {

	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\fb.json");
	}
}
