package cl.lourcastiilo.seleniumpoc.pages;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static final String SEARCHPATH = "//*[@id=\"header-med-search-bar-SearchBar-79247401-c89a-4b16-9d3c-f91206c21c2c-desktop\"]/input";
	private WebDriver driver;
	private WebElement searchInput;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.searchInput = this.driver.findElement(ByXPath.xpath(SEARCHPATH));
	}

	public WebElement getSearchInput() {
		return searchInput;
	}

	public void setSearchInput(String text) {
		this.searchInput.sendKeys(text);
	}
	
	public void doSearch() {
		this.searchInput.sendKeys(Keys.ENTER);
	}

}
