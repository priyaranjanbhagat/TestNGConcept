package LoanManagement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {

	@Parameters({"URL","APIKey/userName"})
	@Test
	public void webLoginPersonalLoan(String urlName, String username) {
		System.out.println("Web Login PersonalLoan");
		System.out.println(urlName);
		System.out.println(username);
	}

	@Test
	public void mobileLoginPersonalLoan() {
		System.out.println("Mobile Login PersonalLoan");

	}

	@Test
	public void mobileSigninPersonalLoan() {
		System.out.println("Mobile Signin PersonalLoan");

	}

	@Test
	public void mobileSignoutPersonalLoan() {
		System.out.println("Mobile Sign out PersonalLoan");

	}

	@Test
	public void apiLoginPersonalLoan() {
		System.out.println("Api Login PersonalLoan");
	}
}
