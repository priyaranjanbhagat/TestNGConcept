package DataProviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {


	@Test(dataProvider= "getData")
	public void login(String userName, String password) {
		System.out.println("Login to the application using dataProvider");
		System.out.println("username");
		System.out.println("password");

	}

	@DataProvider
	public Object[][] getData() {
		//1st combination - username and password - good credit score
		//2nd combination - username and password - no credit  history
		//3rd combination - username and password - fraudlent credit history

		Object[][] data = new Object[3][2];

		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";

		//2ndset
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";

		return data;
	}

}
