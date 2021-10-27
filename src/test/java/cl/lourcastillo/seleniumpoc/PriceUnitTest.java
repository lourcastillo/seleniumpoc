package cl.lourcastillo.seleniumpoc;

import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cl.lourcastiilo.seleniumpoc.pages.HomePage;
import cl.lourcastiilo.seleniumpoc.pages.SearchPage;

public class PriceUnitTest {
	
	private WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void validatePrice() {
		driver.get("https://www.sodimac.cl/sodimac-cl/");
		HomePage home = new HomePage(driver);
		home.setSearchInput("pintura blanca");
		home.doSearch();
		
		SearchPage search = new SearchPage(driver);
		String valor1 = search.getFirstPrice().getText();
		
		assertNotNull("El precio del producto no existe", valor1);
		
		//search.getFirstElement().click();
		
	}

}
