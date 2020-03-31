package utility;

import org.openqa.selenium.WebElement;

public class GenericFunctions {
	
	
	public void enterText(WebElement elementObj, String vText){
		elementObj.clear();
		elementObj.sendKeys(vText);
	}
	
	public void clickOnElement(WebElement elementObj){
		elementObj.click();
	}

}
