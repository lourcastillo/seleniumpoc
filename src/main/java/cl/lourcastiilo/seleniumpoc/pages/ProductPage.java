package cl.lourcastiilo.seleniumpoc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	private static final String PRICEPATH = ".jsx-1373953156 .jsx-3655512908 > .jsx-3655512908:nth-child(1)";
	private WebElement price;
	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		this.price = this.driver.findElement(By.cssSelector(PRICEPATH));
	}

	public String getPrice() {
		return price.getText();
	}

	public void setPrice(WebElement price) {
		this.price = price;
	}

}