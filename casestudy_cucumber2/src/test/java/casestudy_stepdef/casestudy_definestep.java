package casestudy_stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import casestudy_stepdef.casestudy_drivers;

public class casestudy_definestep {
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver=casestudy_drivers.getDriver("chrome");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("I open my application")
	public void i_open_my_application() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Click on SignUp")
	public void click_on_SignUp() {
		driver.findElement(By.linkText("SignUp")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("I enter user Name as {string}")
	public void i_enter_user_Name_as(String username) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@id='err']")).click();
		  Thread.sleep(10000);
		  String res=driver.findElement(By.xpath("//span[@id='err']")).getText();
		  if(res.equalsIgnoreCase("Available")) {
			  System.out.println("Available");
		  }
		  else {
			  System.out.println("Name already exists");
		  }
		  //driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter First Name as {string}")
	public void i_enter_First_Name_as(String firstname) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
		boolean fname=driver.findElement(By.xpath("//input[@id='firstName']")).isDisplayed();
		  System.out.println("Firstname displayed: "+fname);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter Last Name as {string}")
	public void i_enter_Last_Name_as(String lastname) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
		 boolean lname=driver.findElement(By.xpath("//input[@id='lastName']")).isDisplayed();
		  System.out.println("Lastname displayed: "+lname);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 boolean pass=driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
		  System.out.println("Password displayed: "+pass);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter Confirm Password as {string}")
	public void i_enter_Confirm_Password_as(String confpass) {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(confpass);
		  boolean confirmpass=driver.findElement(By.xpath("//input[@id='pass_confirmation']")).isDisplayed();
		  System.out.println("pass_confirmation displayed: "+confirmpass);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I select Gender as Female")
	public void i_select_Gender_as_Female() {
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		  //boolean gender=driver.findElement(By.xpath("//label[@class='form-control input-lg']//input[1]")).isSelected();
		  boolean gender=driver.findElement(By.xpath("//span[contains(text(),'Female')]")).isSelected();
		   System.out.println("Gender:"+gender);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException(); ////span[contains(text(),'Female')]
	}

	@When("I enter E-Mail as {string}")
	public void i_enter_E_Mail_as(String email) {
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(email);
		boolean email1=driver.findElement(By.xpath("//input[@id='emailAddress']")).isDisplayed();
		  System.out.println("email Address displayed: "+email1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter Mobile Number as {string}")
	public void i_enter_Mobile_Number_as(String phno) {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(phno);
		 boolean phno1=driver.findElement(By.xpath("//input[@id='mobileNumber']")).isDisplayed();
		  System.out.println("Mobile number displayed: "+phno1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter DOB as {string}")
	public void i_enter_DOB_as(String dob) {
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(dob);
		 boolean dob1=driver.findElement(By.xpath("//input[@id='dob']")).isDisplayed();
		  System.out.println("DateOfBirth displayed: "+dob1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter Address as {string}")
	public void i_enter_Address_as(String address) {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
		 boolean add=driver.findElement(By.xpath("//textarea[@id='address']")).isDisplayed();
		  System.out.println("Address displayed: "+add);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I select any Security Question")
	public void i_select_any_Security_Question() {
		 Select ans=new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
		  ans.selectByIndex(1);
		  boolean ques=driver.findElement(By.xpath("//select[@id='securityQuestion']")).isDisplayed();
		  System.out.println("Answer displayed: "+ques);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("I enter Security answer as {string}")
	public void i_enter_Security_answer_as(String answer) {
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(answer);
		 boolean answer1=driver.findElement(By.xpath("//input[@id='answer']")).isDisplayed();
		  System.out.println("Answer displayed: "+answer1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I click on Register button")
	public void i_click_on_Register_button() {
		 boolean submit=driver.findElement(By.xpath("//input[@name='Submit']")).isEnabled();
		  System.out.println("Submit Enabled: "+submit);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User must registered sucessfully")
	public void user_must_registered_sucessfully() {
		System.out.println("User registered Sucessfully");
		//driver.findElement(By.xpath(""));
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	
	//----------------------------------------------------------------------------------
	@Given("user name is {string} and password is {string}")
	public void user_name_is_and_password_is(String username, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver=casestudy_drivers.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("click on login")
	public void click_on_login() {
		 driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("home page is launched")
	public void home_page_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		int login_status=driver.getTitle().compareToIgnoreCase("Home");
		 System.out.println(login_status);
		 if(login_status==0)
		 {
		  System.out.println("Login successful");
		 }
		 else
		 {
		  System.out.println("Login failed");
		 }
	}
	//-------------------------------------------------------------------------------------
	
	@Given("user search for the required product")
	public void user_search_for_the_required_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver=casestudy_drivers.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
		 
		Thread.sleep(3000);
		  Actions act =new Actions(driver);
		  WebElement search=driver.findElement(By.id("myInput"));
		 
		  act.keyDown(search, Keys.SHIFT).sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").pause(3000).keyUp(Keys.SHIFT).perform();
		  Thread.sleep(5000);
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Shopping bag')]"))).click().perform();
	}

	@When("user clicks on Find Details")
	public void user_clicks_on_Find_Details() {
		  driver.findElement(By.xpath("//form//input[@name='val']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user clicks in Add To Cart")
	public void user_clicks_in_Add_To_Cart() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user shall be redirected to View Cart page")
	public void user_shall_be_redirected_to_View_Cart_page() {
		WebElement check = driver.findElement(By.tagName("b"));
		 String text = check.getText();
		 Assert.assertEquals("1", text);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		 WebElement same=driver.findElement(By.tagName("h4"));
		 String x1=same.getText();
		 Assert.assertEquals("Shopping bag", x1);
		 
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
//---------------------------------------------------------------------------------------------
	
	@Given("user proceeds to checkout")
	public void user_proceeds_to_checkout() throws InterruptedException {
		driver=casestudy_drivers.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
		 Thread.sleep(3000);
		  Actions act =new Actions(driver);
		  WebElement search=driver.findElement(By.id("myInput"));
		 act.keyDown(search, Keys.SHIFT).sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").pause(3000).keyUp(Keys.SHIFT).perform();
		  Thread.sleep(5000);
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Shopping bag')]"))).click().perform();
		  driver.findElement(By.xpath("//form//input[@name='val']")).click();
		  driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
		  WebElement check = driver.findElement(By.tagName("b"));
			 String text = check.getText();
			 Assert.assertEquals("1", text);
			 driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
			 WebElement same=driver.findElement(By.tagName("h4"));
			 String x1=same.getText();
			 Assert.assertEquals("Shopping bag", x1);
			 
		 
		  driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		  driver.findElement(By.xpath("//input[@id='choice-dollar']")).click();
		  driver.findElement(By.xpath("//textarea[@id='add2']")).click();
		  driver.findElement(By.xpath("//textarea[@id='add2']")).sendKeys("Lucknow");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user proceeds to Pay")
	public void user_proceeds_to_Pay() throws InterruptedException  {
		driver.findElement(By.xpath("//form[2]//input[1]")).click();
		  Thread.sleep(8000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters the required details")
	public void user_enters_the_required_details() {
		 driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		  driver.findElement(By.xpath("//a[@id='btn']")).click();

		  driver.findElement(By.xpath("//input[@name='username']")).click();
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@name='password']")).click();
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("//div[3]//input[1]")).click();
		 
		  driver.findElement(By.xpath("//input[@name='transpwd']")).click();
		  driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//div[@class='user-right']//input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Order placed sucessfully")
	public void order_placed_sucessfully() {
		System.out.println("Order placed sucessfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
