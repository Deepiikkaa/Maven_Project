package com.Test_Next_Generation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyser_Practise implements IRetryAnalyzer{

	int start = 1;
	int end = 9;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (start<=end) {
			start++;
			return true;
		}
		
		return false;
	}

}

//run at assert_practise1 class to get output