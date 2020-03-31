package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.GenericFunctions;

public class AmazonAsGuestHomePage {
	
	WebDriver driver;
	GenericFunctions genObj = new GenericFunctions();
	
	public AmazonAsGuestHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//@FindBy(xpath="//a[@id='nav-link-accountList']")
	//public WebElement signInLink;
	
	By searchBox = By.id("twotabsearchtextbox");
	By search = By.id("nav-search-submit-text");
	
	public WebElement mobileMenu = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	public WebElement searchBox(){
		return driver.findElement(searchBox);
	}
	
	public WebElement search(){
		return driver.findElement(search);
	}
	
	public void click_Mobile_Menu(){
		genObj.clickOnElement(mobileMenu);
	}
	
}
