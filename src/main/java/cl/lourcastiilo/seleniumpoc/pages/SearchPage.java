package cl.lourcastiilo.seleniumpoc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	private static final String ELEMENTPATH = ".product-wrapper:nth-child(1) > .jsx-411745769";
	private static final String PRICEPATH = "div.product-wrapper:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)";
	private WebDriver driver;
	private WebElement firstElement;
	private WebElement firstPrice;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		this.firstElement = this.driver.findElement(By.cssSelector(ELEMENTPATH));
		this.firstPrice = this.driver.findElement(By.cssSelector(PRICEPATH));
	}

	public WebElement getFirstElement() {
		return firstElement;
	}

	public void setFirstElement(WebElement firstElement) {
		this.firstElement = firstElement;
	}

	public WebElement getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(WebElement firstPrice) {
		this.firstPrice = firstPrice;
	}

}
