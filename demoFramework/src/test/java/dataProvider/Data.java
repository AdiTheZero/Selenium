package dataProvider;

import org.testng.annotations.DataProvider;

import BasePackage.BaseClass;

public class Data extends BaseClass{

	
	@DataProvider(name="loginDetails")
	public Object[][] loginDetails() {
	Object [][] data = {{"rajdeep@email.com", "Raj@123456"}
						,{"studynotesspn555@gmail.com","Adity@123"}}; 
	return data;
	}
	
	@DataProvider(name="sampleData")
	public Object[][] sampleData(){
		Object[][] data = {{"id1","pass1"},
							{"id2","pass2"},
							{"id3", "pass3"}};
		return data;
	}
}
