package com.testing;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bsh.commands.dir;

public class PageFile extends LocatorsFile  {

public WebDriver driver;
public ErrorCollector errCol = new ErrorCollector();

	public void openBrowser() throws IOException, InterruptedException {
		
		//Opening Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:/DEV_IT_Training/DIT002/SeleniumJars/chromedriver.exe");
		driver = new ChromeDriver();	
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		PageFactory.initElements(driver, this);	

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	public void openURL() throws Exception {	
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");	//opening any URL
		Thread.sleep(2000);
		
	
	
	}
	
  public void NoEmail() throws InterruptedException {
		
	  		NextButton.click(); // click on Next Button
	  		Thread.sleep(2000);
		   
		
		   String actual_msg= NoEmailErrorMessage.getText();
		   String expected_msg="Enter an email or phone number";

		   Assert.assertEquals(actual_msg, expected_msg);
			
			try {
				Assert.assertEquals( actual_msg,expected_msg);
				System.out.println("both error msg are same - test pass");
			
			}
			catch (Throwable t) {
			
				System.out.println("both error msg are different - test fail");
				errCol.addError(t);
				System.out.println(t);
			}  
			
			
	
	}
	
public void NoPassword() throws InterruptedException {
	
  
	   EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Email
	   Thread.sleep(2000);
	   NextButton.click(); // click Next Button
	   Thread.sleep(2000);
	   NextButtonofpassword.click(); // click Next Button
	   Thread.sleep(1000);
	
	
	   String actual_msg= NoPasswordErrorMessage.getText();
	   String expected_msg="Enter a password";

	   Assert.assertEquals(actual_msg, expected_msg);
		
		try {
			Assert.assertEquals( actual_msg,expected_msg);
			System.out.println("both error msg are same - test pass");
		
		}
		catch (Throwable t) {
		
			System.out.println("both error msg are different - test fail");
			errCol.addError(t);
			System.out.println(t);
		}  
	
}
public void InvalidEmail() throws InterruptedException {
	
		EmailField.sendKeys("xxxx@gmail.com"); // Enter Invalid EmailID
		Thread.sleep(2000);
		NextButton.click();// click on Next Button
		Thread.sleep(2000);
		
	  
	   String actual_msg= InvalidEmailErrorMessage.getText();
	   String expected_msg="Couldn't find your Google Account";

	   Assert.assertEquals(actual_msg, expected_msg);
		
		try {
			Assert.assertEquals( actual_msg,expected_msg);
			System.out.println("both error msg are same - test pass");
		
		}
		catch (Throwable t) {
		
			System.out.println("both error msg are different - test fail");
			errCol.addError(t);
			System.out.println(t);
		}  
}

public void InvalidPassword() throws InterruptedException

{
	
	 	EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
	 	Thread.sleep(2000);
	 	NextButton.click();  // Click on Next Button
	 	Thread.sleep(2000);
	 	PasswordField.sendKeys("xxxx"); // Enter Invalid Password
	 	Thread.sleep(2000);
	 	NextButtonofpassword.click(); // Click on Next Button
	 	Thread.sleep(1000);
	
	
	 	
	 	String actual_msg=InvalidPasswordErrorMessage.getText();
	 
	 	String expected_msg="Wrong password. Try again or click Forgot password to reset it.";

	 	Assert.assertEquals(actual_msg, expected_msg);
		
		try {
			Assert.assertEquals( actual_msg,expected_msg);
			System.out.println("both error msg are same - test pass");
		
		}
		catch (Throwable t) {
		
			System.out.println("both error msg are different - test fail");
			errCol.addError(t);
			System.out.println(t);
		}  

}


public void ValidEmailPassword() throws InterruptedException {
	
   
	   EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
	   Thread.sleep(2000);
	   NextButton.click(); // Click On NExt Button
	   Thread.sleep(2000);
	   PasswordField.sendKeys("aarti5458"); // Enter Valid Password
	   Thread.sleep(2000);
	   NextButtonofpassword.click(); // Click on Next Button
	   Thread.sleep(1000);
	
	   if(driver.getCurrentUrl().contains("mail"))
		System.out.println("ValidEmailPasswordTest  - PASS");
	  
	   else
		System.out.println("ValidEmailPasswordTest - FAIL");
	
	
	   System.out.println("User logged successfully");
	
	
}

public void TotalFirstPageEmail() throws InterruptedException {
	
	   EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
	   Thread.sleep(2000);
	   NextButton.click(); // Click on Next Button
	   Thread.sleep(2000);
	   PasswordField.sendKeys("aarti5458"); // Enter Valid Password
	   Thread.sleep(2000);
	   NextButtonofpassword.click(); // Click on Next Button
	   Thread.sleep(1000);
	

	   List<WebElement> emails = TotalInboxFirstPageEmails;
	   Thread.sleep(2000);
	   System.out.println("Total number of emails of the Firstpage of Inbox : " + emails.size()); 
	   
	   
}
public void TotalInboxEmail() throws InterruptedException {
	
		EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
		Thread.sleep(2000);
		NextButton.click(); // Click on Next Button
		Thread.sleep(2000);
		PasswordField.sendKeys("aarti5458"); // Enter valid Password
		Thread.sleep(2000);
		NextButtonofpassword.click(); // Click on Next Button
		Thread.sleep(1000);
	
	
		WebElement mailsize= TotalInboxEmails;
		Thread.sleep(2000);
		System.out.println("Total number of emails of the Inbox : " + mailsize.getText());  
	   
}

public void MoveEmailInboxToTrash() throws InterruptedException {
	
	EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
	Thread.sleep(2000);
	NextButton.click(); // Click on Next Button
	Thread.sleep(2000);
	PasswordField.sendKeys("aarti5458");  // Enter Valid Password
	Thread.sleep(2000);
	NextButtonofpassword.click(); // Click on Next Button
	Thread.sleep(1000);



	SelectEmail.click();   // Select Email
	Thread.sleep(2000);
	MoveTo.click(); // Click on MoveTo Button
	Thread.sleep(2000);
	
	Bin.click(); // Click on Bin
	Thread.sleep(2000);
	System.out.println("Email moved from Inbox to Bin ");  
	
	WebElement mailsize= TotalInboxEmails;
	  Thread.sleep(2000);
	 System.out.println("Total number of emails of the Inbox : " + mailsize.getText());  
} 
public void MoveEmailTrashToInbox() throws InterruptedException {
	EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
	Thread.sleep(1000);
	NextButton.click(); // Click on Next Button
	Thread.sleep(1000);
	PasswordField.sendKeys("aarti5458"); // Enter Valid Password
	Thread.sleep(1000);
	NextButtonofpassword.click(); // Click on NExt Button
	Thread.sleep(1000);

      
	More.click(); // click on More Button
	Thread.sleep(1000);
	 
	Bin1.click(); // Click on Bin Button
	Thread.sleep(1000);

	SelectEmailOfBin.click(); // Select Email
	Thread.sleep(1000);

	Move.click(); // Click on move Button
	Thread.sleep(1000);
	
	Inbox.click();  // Click on Inbox Button
 
	System.out.println("Email Moved From Bin to Inbox");
	Thread.sleep(2000);    
	
	/*Lessbutton.click(); //Click on Less Button
	Thread.sleep(2000);
	
	InboxPage.click(); // Click on Inbox Button
	Thread.sleep(1000);
	
	WebElement mailsize= TotalInboxEmails;
		  Thread.sleep(1000);
		 System.out.println("Total number of emails of the Inbox : " + mailsize.getText()); */
	  
	
}

public void MarkedReadEmailToUnreademail() throws InterruptedException {
	EmailField.sendKeys("aartipatel5458@gmail.com");  // Enter Valid EmailID
	Thread.sleep(1000);
	NextButton.click(); // Click on Next Button
	Thread.sleep(1000);
	PasswordField.sendKeys("aarti5458");  // Enter Valid Password 
	Thread.sleep(1000);
	NextButtonofpassword.click();  // Click on Next Button
	Thread.sleep(1000);

     
     SelectEmail.click(); // Select Email
     Thread.sleep(1000);
     More1.click(); // Click on More Button
     Thread.sleep(1000);
  	 MarkAsUnread.click(); // Click on Mark as Unread Button
  	 Thread.sleep(1000);
  	
  	 String actual_msg= MarkAsUnreadMessage.getText();
	   String expected_msg="Conversation marked as unread.";

	   Assert.assertEquals(actual_msg, expected_msg);
		
		try {
			Assert.assertEquals( actual_msg,expected_msg);
			System.out.println("Both messages are same - test pass");
			System.out.println("Email marked as Unread email");
		}
		catch (Throwable t) {
		
			System.out.println("Both messages are different - test fail");
			System.out.println("Email did not Mark as Unread Email");
			errCol.addError(t);
			System.out.println(t);
		}  
	

  	   


}

public void MarkedUnreademailToReadEmail() throws InterruptedException {
	
	EmailField.sendKeys("aartipatel5458@gmail.com"); // Enter Valid EmailID
	Thread.sleep(1000);
	NextButton.click(); // Click on Next Button
	Thread.sleep(1000);
	PasswordField.sendKeys("aarti5458"); // Enter Valid Password
	Thread.sleep(1000);
	NextButtonofpassword.click(); // Click on Next Button
	Thread.sleep(1000);

    
	 SelectEmail.click(); // Select Email
     Thread.sleep(1000);
     More1.click();  // Click on More Button
     Thread.sleep(1000);
 	 MarkAsRead.click(); // Click on Mark as Read Button
 	 Thread.sleep(1000);
 	
  	
  		String actual_msg= MarkAsReadMessage.getText();
  		String expected_msg="Conversation marked as read.";

	   Assert.assertEquals(actual_msg, expected_msg);
		
		try {
			Assert.assertEquals( actual_msg,expected_msg);
			System.out.println("both  messages are same - test pass");
			System.out.println("Email Marked as Read Email");
		}
		catch (Throwable t) {
		
			System.out.println("both  messages are different - test fail");
			System.out.println("Email did not Mark as Read Email ");
			errCol.addError(t);
			System.out.println(t);
		}  
  	

}

}