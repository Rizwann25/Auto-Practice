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
			HelperClass.enterElement(driver, Location_path.getProperty("Address1"), Data_path.getProperty("Address"));
			HelperClass.enterElement(driver, Location_path.getProperty("CityPath"), Data_path.getProperty("City"));
			HelperClass.elementClick(driver, Location_path.getProperty("State"));
			HelperClass.enterElement(driver, Location_path.getProperty("PostalCode"), Data_path.getProperty("Postal"));
			HelperClass.elementClick(driver, Location_path.getProperty("Country"));
			HelperClass.enterElement(driver, Location_path.getProperty("MobilePhone"), Data_path.getProperty("Mobile"));
			HelperClass.enterElement(driver, Location_path.getProperty("AliasAddress"), Data_path.getProperty("Alias"));
			HelperClass.enterElement(driver, Location_path.getProperty("Password"), Data_path.getProperty("Pwd"));
			HelperClass.elementClick(driver, Location_path.getProperty("Register"));
			HelperClass.elementClick(driver, Location_path.getProperty("HomeButton1"));
			Thread.sleep(2000);
			
			//Add To Cart
			HelperClass.elementClick(driver, Location_path.getProperty("BestSeller"));
			HelperClass.elementClick(driver, Location_path.getProperty("Product1"));
			HelperClass.elementClick(driver, Location_path.getProperty("QuantityPlus"));
			HelperClass.elementClick(driver, Location_path.getProperty("Size"));
			HelperClass.elementClick(driver, Location_path.getProperty("AddToCartButton"));
			HelperClass.elementClick(driver, Location_path.getProperty("ContinueShopping"));
			HelperClass.elementClick(driver, Location_path.getProperty("Women"));
			HelperClass.elementClick(driver, Location_path.getProperty("DressesIcon"));
			HelperClass.elementClick(driver, Location_path.getProperty("SummerDresses"));
			HelperClass.elementClick(driver, Location_path.getProperty("SummerProduct1"));
			HelperClass.elementClick(driver, Location_path.getProperty("Size"));
			Thread.sleep(2000);
			
			//Check Out
			HelperClass.elementClick(driver, Location_path.getProperty("AddToCartButton"));			
			HelperClass.elementClick(driver, Location_path.getProperty("CheckOut"));
			HelperClass.elementClick(driver, Location_path.getProperty("ProceedToCheckOut"));
			HelperClass.elementClick(driver, Location_path.getProperty("NextCheckOut"));
			HelperClass.elementClick(driver, Location_path.getProperty("CheckBox"));
			HelperClass.elementClick(driver, Location_path.getProperty("NextButton"));
			Thread.sleep(2000);
			
			//Payment to Proceed
			HelperClass.elementClick(driver, Location_path.getProperty("PayByCheck"));
			HelperClass.elementClick(driver, Location_path.getProperty("ConfirmMyOrder"));
			Thread.sleep(2000);
			
			}
}
