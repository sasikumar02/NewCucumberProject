package org.testrunnerpackage.ccom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
	public static void generateJvmReport(String jsonPath) {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");
		Configuration con=new Configuration(f, "Facebook Page");
		con.addClassifications("Plateform Name ","Windows");
		con.addClassifications("Plateform Version","10");
		con.addClassifications("Browser Name","Chrome");
		con.addClassifications("Browser version ","89.0");
		List<String> li=new ArrayList<String>();
		li.add(jsonPath);
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		
	}

}
