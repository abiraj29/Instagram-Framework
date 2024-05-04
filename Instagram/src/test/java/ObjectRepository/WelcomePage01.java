package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage01 {
	
	public WelcomePage01(WebDriver driver) {
		    PageFactory.initElements(driver,this);
		    
	}
	     @FindBy(linkText="Register")
	     private WebElement registerlink;
	     
	     @FindBy(linkText="Log in")
	     private WebElement LoginLink;
	     
	     @FindBy(partialLinkText="Books")
	     private WebElement BooksLink;
	     
	     @FindBy(partialLinkText="Computers")
	     private WebElement ComputersLink;
	     
	     @FindBy(partialLinkText="Apparel & Shoes")
	     private WebElement ApparelandShoesLink;
	     
	     @FindBy(partialLinkText="Electronics")
	     private WebElement ElectronicsLink;
	     
	     @FindBy(partialLinkText="Shoppping cart")
	     private WebElement ShopppingcartLink;
	     
	     @FindBy(partialLinkText="Wishlist")
	     private WebElement WishlistLink;
	    
	     @FindBy(partialLinkText="small-searchterms")
	     private WebElement small-searchtermsLink;
	     
	     
	     
	     
	     
	     
}

	
	