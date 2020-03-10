package com.testing;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	@FindBy(xpath = "//*[@id='identifierId']") public WebElement EmailField;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/span/span") public WebElement NextButton ;
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input") public WebElement PasswordField  ;
	@FindBy(xpath = "//*[@id=\"passwordNext\"]/span/span") public WebElement NextButtonofpassword ;
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div") public WebElement NoEmailErrorMessage;
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]") public WebElement NoPasswordErrorMessage;
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div") public WebElement InvalidEmailErrorMessage;
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]") public WebElement InvalidPasswordErrorMessage;
	@FindBy(xpath = "//*[@class=\"Cp\"]/div/table/tbody/tr") public List<WebElement> TotalInboxFirstPageEmails;
	@FindBy(xpath = "//span[@class=\"Dj\"]/span[2]") public WebElement TotalInboxEmails;
	@FindBy(xpath = "//*[@class=\"Cp\"][2]/div/table/tbody/tr/td[2]/div") public WebElement SelectEmail;
	@FindBy(xpath = "//*[@class='bzn']/div/div[4]/div[1]") public WebElement MoveTo;
	@FindBy(xpath = "//*[@role=\"menuitem\" and @act=\"10\"]") public WebElement Bin;
	@FindBy(xpath = "//*[@class='ait']") public WebElement More;
	@FindBy(xpath = "//*[@class=\"HwgYue\"]/div/div[1]/div/div[6]/div") public WebElement Bin1;
	@FindBy(xpath = "//*[@id=\":ew\" and @role=\"checkbox\"]") public WebElement SelectEmailOfBin;
	@FindBy(xpath = "//*[@id=\":ep\"]/div[1]") public WebElement Move;
	@FindBy(xpath = "//*[@act=\"304\" ]") public WebElement Inbox;
	@FindBy(xpath = "//*[@class='ait']") public WebElement Lessbutton;
	@FindBy(linkText = "Inbox") public WebElement InboxPage;  
	@FindBy(xpath = "//*[@class=\"bzn\"]/div/div[7]") public WebElement More1;
	@FindBy(xpath = "//*[@class=\"J-M aX0 aYO jQjAxd\"]/div/div[3]/div") public WebElement MarkAsUnread;
	@FindBy(xpath = "html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div/div[3]/div/div/div[2]/span/span[1]") public WebElement MarkAsUnreadMessage;
	@FindBy(xpath ="//*[@class=\"J-M aX0 aYO jQjAxd\"]/div/div[2]/div") public WebElement MarkAsRead;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div/div[3]/div/div/div[2]/span/span[1]") public WebElement MarkAsReadMessage;

}
