package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage {
		
		public Bookspage(WebDriver driver) {
			PageFactory.initElements(driver,this);
	}
		@FindBy(id="products-orderby")
		private WebElement SortByDropDown;
		
		public WebElement getSortByDropDown() {
			return SortByDropDown;
		}

}
