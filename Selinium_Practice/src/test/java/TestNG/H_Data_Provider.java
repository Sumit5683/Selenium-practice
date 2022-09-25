package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class H_Data_Provider {

	@Test(dataProvider="dataset")
	public void test(String username, String password) {
		System.out.println(username+"  =  "+password);
		
	}
		
		@DataProvider
		public Object[][] dataset() {
			Object[][] dataset = new Object[4][2];
			
			//first row
			dataset[0][0] = "user 1";
			dataset[0][1] = "pass 1";
			
			//second row
			dataset[1][0] = "user 2";
			dataset[1][1] = "pass 2";
			
			//third row
			dataset[2][0] = "user 3";
			dataset[2][1] = "pass 3";
			
			//fourth row
			dataset[3][0] = "user 4";
			dataset[3][1] = "pass 4";
			
			return dataset;
		}
		
//		another way to write above lengthy process
		@Test(dataProvider="dataset1")
		public void test1(String username, String password, String test) {
			System.out.println(username+" = "+password+" = "+test);
		}
		
		@DataProvider
		public Object[] [] dataset1(){
			return new Object[] [] {
				{"username1","password1","test1"},
				{"username2","password2","test2"},
				{"username3","password3","test3"},
				{"username4","password4","test4"}
			};
		}

	

}
