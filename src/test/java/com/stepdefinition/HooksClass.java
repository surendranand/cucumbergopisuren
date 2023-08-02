package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.OmrBranchbaseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends Baseclass {
	@Before
	public void beforescenario() throws FileNotFoundException, IOException {
		getdriver(getpropertyfilevalue("browser"));
		enterurl(getpropertyfilevalue("url"));
		maximizewindow();
		waitimplicitly();
	}
	@After
	public void Afterscenario() {
closeallwindow();
	}

}
