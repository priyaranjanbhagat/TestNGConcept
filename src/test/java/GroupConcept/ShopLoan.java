package GroupConcept;

import org.testng.annotations.Test;

public class ShopLoan {


	@Test(groups={"Smoke"})
	public void webLoginShopLoan() {

		System.out.println("Web Login Shop Loan");
	}

	@Test(enabled=false)
	public void mobileLoginShopLoan() {

		System.out.println("Mobile Login Shop Loan");
	}

	@Test
	public void apiLoginShopLoan() {

		System.out.println("API Login Shop Loan");
	}

	@Test
	public void dbLoginShopLoan() {

		System.out.println("DB Login Shop Loan");
	}
}
