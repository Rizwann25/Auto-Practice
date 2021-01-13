package com.atmecs.autoprac.testscripts;

import org.testng.annotations.Test;

import com.atmecs.autoprac.pages.AutoPracticePages;
import com.atmecs.autoprac.setup.SetUp;

		public class AutoPracticeTestScript extends SetUp   {
		
			@Test
			public void AutoPractice() throws Exception
			{
				AutoPracticePages run=new AutoPracticePages();
				run.practice();
				
			}
}
