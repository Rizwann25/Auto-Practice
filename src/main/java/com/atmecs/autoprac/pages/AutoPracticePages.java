package com.atmecs.autoprac.pages;

import java.util.Properties;
import com.atmecs.autoprac.constants.Constants;
import com.atmecs.autoprac.helper.HelperClass;
import com.atmecs.autoprac.reader.PropertyReader;
import com.atmecs.autoprac.setup.SetUp;
	

	public class AutoPracticePages extends SetUp {

		Properties Location_path;
		Properties Data_path;
		Properties validate_path;
	    
		//Login with Credentials
		public void practice() throws InterruptedException {
			Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
			Data_path = PropertyReader.readProperty(Constants.CONFIG_PATH);
			Thread.sleep(3000);
			
			//Sign In 
			HelperClass.elementClick(driver, Location_path.getProperty("SignIn"));
			HelperClass.enterElement(driver, Location_path.getProperty("EmailCreate"), Data_path.getProperty("Email"));			
			HelperClass.elementClick(driver, Location_path.getProperty("CreateAccount"));
			
			Thread.sleep(3000);
			//Personal Info
			HelperClass.elementClick(driver, Location_path.getProperty("Gender"));
			HelperClass.enterElement(driver, Location_path.getProperty("FName"), Data_path.getProperty("FirstName"));
			HelperClass.enterElement(driver, Location_path.getProperty("LName"), Data_path.getProperty("LastName"));
			HelperClass.enterElement(driver, Location_path.getProperty("Password"), Data_path.getProperty("Pwd"));
			
			Thread.sleep(2000);
			HelperClass.elementClick(driver, Location_path.getProperty("DOBDate"));
			HelperClass.elementClick(driver, Location_path.getProperty("DOBMonth"));
			HelperClass.elementClick(driver, Location_path.getProperty("DOBYear"));
			
			Thread.sleep(2000);
			}
}
