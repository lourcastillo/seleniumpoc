package cl.lourcastillo.seleniumpoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cl.lourcastiilo.seleniumpoc.pages.HomePage;
import cl.lourcastiilo.seleniumpoc.pages.ProductPage;
import cl.lourcastiilo.seleniumpoc.pages.SearchPage;

public class PriceUnitTest {
	
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		this.driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void validatePrice() {
		this.driver.get("https://www.sodimac.cl/sodimac-cl/");
		HomePage home = new HomePage(this.driver);
		home.setSearchInput("pintura blanca");
		home.doSearch();
		
		SearchPage search = new SearchPage(this.driver);
		String valor1 = search.getFirstPrice();
		
		assertNotNull("El precio del producto no existe", valor1);
		
		search.getFirstElement().click();
		
		ProductPage product = new ProductPage(this.driver);
		String valor2 = product.getPrice();
		
		assertEquals("Los precios no son iguales", valor1, valor2);
	}

}
