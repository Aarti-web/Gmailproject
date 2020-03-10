package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	
PageFile pf = new PageFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		pf.closeBrowser();
	}
   
   @Test(priority = 1)  
	    public void NoEmail() throws InterruptedException
	    {
	    	pf.NoEmail();  
	    }
    @Test(priority = 2) 
    public void  NoPassword() throws InterruptedException
    {
    	pf. NoPassword();
    }
    @Test(priority = 3) 
    public void InvalidEmail() throws InterruptedException
    {
    	pf.InvalidEmail();
    }
    @Test(priority = 4) 
    public void InvalidPassword() throws InterruptedException
    {
    	pf.InvalidPassword();
    }
    @Test(priority = 5) 
    public void ValidEmailPassword() throws InterruptedException
    {
    	pf.ValidEmailPassword();
    } 
    
    @Test(priority = 6) 
    public void TotalFirstPageEmail() throws InterruptedException
    {
    	pf.TotalFirstPageEmail(); 
    }  
    @Test(priority = 7) 
    public void TotalInboxEmail () throws InterruptedException
    {
    	pf.TotalInboxEmail(); 
} 
@Test(priority = 8) 
    public void MoveEmailInboxToTrash() throws InterruptedException
    {
    	pf.MoveEmailInboxToTrash();
    } 
    
  @Test(priority = 9) 
    public void MoveEmailTrashToInbox () throws InterruptedException
    {
    	pf.MoveEmailTrashToInbox();
    }
 @Test(priority = 10) 
        public void MarkedReadEmailToUnreademail () throws InterruptedException

    {
    	pf.MarkedReadEmailToUnreademail();
    } 
    
  @Test(priority = 11) 
    public void MarkedUnreademailToReadEmail () throws InterruptedException
    {
    	pf.MarkedUnreademailToReadEmail();
    } 
   
	}
