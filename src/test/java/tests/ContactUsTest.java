package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase
{
	HomePage home;
	ContactUsPage contactPage;

	String email = "test@test.com";
	String fullName = "Testssss User";
	String enquiry = "Hello Admin , this is for test";

	@Test

	public void UserCanUseContactUs() {
		home = new HomePage(driver);
		home.openContactUsPage();
		contactPage = new ContactUsPage(driver);
		contactPage.ContactUs(fullName, email, enquiry);
	}

}
