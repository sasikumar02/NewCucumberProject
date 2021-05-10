package org.stepdefinition;


import java.io.IOException;

import org.testrunnerpackage.ccom.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before(order=1)
	public void beforeSanityscenario() {
		System.out.println(" order 1 Sanity @Before ");
	}
	@After(order=1)
	public void afterSanityscenario() {
		System.out.println(" order 1 Sanity @After ");
	}
	@Before(order=2)
	public void beforeRegressionscenario() {
		System.out.println(" order 2 Reg @Before ");
	}
	@After(order=2)
	public void afterRegressionscenario() {
		System.out.println(" order 2 Reg @After ");
	}
	@Before
	public void beforeScenario() {
		launchBrowser();
		maxWindow();
		applyWaits();
	}
	
	@After
	public void afterScenario(Scenario s) throws IOException {
		String name = s.getName();
		String fileName = name.replace(" ", "_");
		takeSnap(fileName);
		closeBrowser();
	}

}
