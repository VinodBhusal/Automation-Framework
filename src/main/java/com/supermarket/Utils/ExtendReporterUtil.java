package com.supermarket.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class  ExtendReporterUtil {
	static ExtentReports extent;
	public void getReporter() {
		String reportPath = System.getProperty("user.dir")+"//Reports//AutomationReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Testing Report");
		reporter.config().setDocumentTitle("CompanyTitle");
        extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name", "Romy");
		extent.setSystemInfo("Environment", "QA");
		
	}
}
