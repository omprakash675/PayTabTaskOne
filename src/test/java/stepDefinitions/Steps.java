package stepDefinitions;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	//Logging
	@Given("Entering the url {string}")
	public void entering_the_url(String url) {
		browseConfigChrome();
	    implicityWait();
	    openUrl(url);
	    maximizeWindow();
	}
	@Given("Entering the username {string} and password {string}")
	public void entering_the_username_and_password(String username, String pass) {
		WebElement user = locateByXPath("//input[@name='username']");
		textInput(user, username);
		locateByXPath("//input[@name='password']").sendKeys(pass);
	    
	}
	@Then("logging into the profile")
	public void logging_into_the_profile() {
	    locateByXPath("//button[@type='submit']").click();
	}
	
	//Adding User
	@Given("Entering into the admin tab and adding user")
	public void entering_into_the_admin_tab_and_adding_user() {
	    locateByXPath("//span[text()='Admin']").click();
	    locateByXPath("//button[text()=' Add ']").click();
	    
	}
	@When("Entering and selecting the datas Name {string} Username {string} and password {string} cpass {string}")
	public void entering_and_selecting_the_datas_name_username_and_password_cpass(String name, String user, String pass, String cpass) throws InterruptedException {
	    locateByXPath("(//div[@class='oxd-select-text-input'])[1]").click();
	    locateByXPath("(//span[text()='Admin'])[2]").click();
		locateByXPath("//input[@placeholder='Type for hints...']").sendKeys(name);
	    Thread.sleep(2000);
	    locateByXPath("//span[text()='Jadine  Jackie']").click();
	    locateByXPath("(//div[@class='oxd-select-text-input'])[2]").click();
	    locateByXPath("//span[text()='Enabled']").click();
	    locateByXPath("(//input[@class='oxd-input oxd-input--active'])[2]").sendKeys(user);
	    locateByXPath("(//input[@type='password'])[1]").sendKeys(pass);
	    locateByXPath("(//input[@type='password'])[2]").sendKeys(cpass);
	}
	@Then("Saving the data")
	public void saving_the_data() {
		locateByXPath("//button[@type='submit']").click();
		quitBrowser();
	}
	
	//New User Logging
	@Given("Entering the url again {string}")
	public void entering_the_url_again(String url) {
		browseConfigChrome();
	    implicityWait();
	    openUrl(url);
	    maximizeWindow();
	}
	@Given("Entering the username {string} and password {string} again")
	public void entering_the_username_and_password_again(String username, String pass) {
		WebElement user = locateByXPath("//input[@name='username']");
		textInput(user, username);
		locateByXPath("//input[@name='password']").sendKeys(pass);
	}
	@Then("logging into the profile again")
	public void logging_into_the_profile_again() {
		locateByXPath("//button[@type='submit']").click();
	}
	
	//Adding Details
	@Given("Entering into the my info tab and adding details")
	public void entering_into_the_my_info_tab_and_adding_details() {
	    locateByXPath("//span[text()='My Info']").click();
	}
	@When("Entering and selecting the datas required Last Name {string}")
	public void entering_and_selecting_the_datas_required_last_name(String middle) {
	    locateByXPath("//input[@name='middleName']").sendKeys(middle);
	    locateByXPath("(//input[@placeholder='yyyy-mm-dd'])[1]").sendKeys("1998-09-02");
	}
	@Then("Saving all the personal detail")
	public void saving_all_the_personal_detail() {
		locateByXPath("(//button[@type='submit'])[1]").click();
	}
	
	//Upload Resume
	@Given("Selecting the Resume")
	public void selecting_the_resume() {
	    locateByXPath("(//button[@type='button'])[2]").click();
	}
	
	@Then("Saving the Resume")
	public void saving_the_resume() {
		locateByXPath("(//button[@type='submit'])[3]").click();
	}

	

	




}
