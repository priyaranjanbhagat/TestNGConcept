package GroupConcept;

import org.testng.annotations.Test;

public class BikeLoan {

	@Test
	public void webLoginBikeLoan() {
		System.out.println("Web Login Bike Loan");
	}

	@Test
	public void mobileLoginBikeLoan() {
		System.out.println("Mobile Login Bike Loan");
	}

	@Test(groups={"Smoke"})
	public void apiLoginBikeLoan() {
		System.out.println("API Login Bike Loan");
	}

	@Test
	public void dbLoginBikeLoan() {
		System.out.println("DB Login Bike Loan");
	}
}
