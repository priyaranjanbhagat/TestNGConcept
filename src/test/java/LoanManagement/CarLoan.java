package LoanManagement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void webLoginCarLoan() {
		System.out.println("Web Login Car Loan");
		System.out.println();
	}

	@Parameters({"URL"})
	@Test
	public void mobileLoginCarLoan(String urlName) {
		System.out.println("Mobile Login Car loan");
		System.out.println(urlName);
	}

	@Test
	public void apiLoginCarLoan() {
		System.out.println("API Login Car Loan");
	}
}
