package com.atmecs.autoprac.constants;

	public class Constants {

			public static final String BASE_PATH = System.getProperty("user.dir");
			
			public static final String RESOURCE_PATH = BASE_PATH + "/src/main/resources";
			
			//Properties Constants
			public static final String LOCATORS_PATH = RESOURCE_PATH + "/locators.properties";
			
			public static final String CONFIG_PATH = RESOURCE_PATH + "/config.properties";
			
			//Drivers Constants
			public static final String CHROME_PATH = BASE_PATH + "/driver/chromedriver.exe";
			
			public static final String GECKO_PATH=BASE_PATH+"/driver/geckodriver.exe";
			
			//Excel File Constants
			public static final String TEST_DATA = RESOURCE_PATH + "/xlsxFile/Scenario1DataFile.xlsx";
			
			public static final String TEST_DATA2 = RESOURCE_PATH + "/xlsxFile/Scenario2DataFile.xlsx";       
	        
	        //Register patients Constants
	        public static final String REGISTER_PATH = RESOURCE_PATH + "/registerPatientLocators.properties";
	                		
}
