package com.excel.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener  {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase failed is :"+result.getName());					
		 
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	    System.out.println("The name of the testcase Skipped is :"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase skipped is:"+result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+" test case started");					
		  
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase passed is :"+context.getName());					
		  
	}

}
