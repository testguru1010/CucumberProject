package page.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	private WebDriver driver;

	private By getFindByAnno(FindBy anno) {

//		log.info(anno);

		switch (anno.how()) {

		case CLASS_NAME:

			return new By.ByClassName(anno.using());

		case CSS:

			return new By.ByCssSelector(anno.using());

		case ID:

			return new By.ById(anno.using());

		case LINK_TEXT:

			return new By.ByLinkText(anno.using());

		case NAME:

			return new By.ByName(anno.using());

		case PARTIAL_LINK_TEXT:

			return new By.ByPartialLinkText(anno.using());

		case XPATH:

			return new By.ByXPath(anno.using());

		default:

			throw new IllegalArgumentException("Locator not Found : " + anno.how() + " : " + anno.using());

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
