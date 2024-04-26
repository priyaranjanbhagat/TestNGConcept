package GroupConcept;

import org.testng.annotations.Test;

public class PropertyLoan {

	@Test
	public void webLoginPropertyLoan() {
		System.out.println("web Login Property Loan");
	}

	@Test(timeOut=5000)
	public void mobileLoginPropertyLoan() {
		System.out.println("Mobile Login Property Loan");
	}

	@Test
	public void apiLoginPropertyLoan() {
		System.out.println("API Login Property Loan");
	}

	@Test(groups={"Smoke"})
	public void dbLoginPropertyLoan() {
		System.out.println("DB Login Property Loan");
	}

	@Test(dependsOnMethods={"webLoginPropertyLoan"})
	public void networkLoginPropertyLoan() {
		System.out.println("Network Login Property Loan");
	}

}
