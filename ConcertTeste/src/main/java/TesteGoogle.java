
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class TesteGoogle {
	@Test
	
	
	public void  teste() {		
	
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle()); 
				
		driver.quit();
		
		
	}
@Test
	
	
	public void  efetuarPesquisa() {			
	
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		WebElement searchInput = driver.findElement(By.name("q"));
	    searchInput.sendKeys("site concert" + Keys.ENTER );
	    Assert.assertEquals("site concert - Pesquisa Google", driver.getTitle());
		
	  driver.quit();
		
		

   }
@Test
public void  clicarAbaPrivacidade() {			
	
	ChromeDriver driver = new ChromeDriver();		
	driver.get("https://www.google.com");
	
	driver.findElement(By.className("pHiOh")).click();
	driver.findElement(By.cssSelector("#cookieBar > div > span.cookieBarButtons > a.cookieBarButton.cookieBarConsentButton")).click();
	 Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
			 .contains("Nossa missão é organizar as informações do mundo para que sejam universalmente acessíveis e úteis para todos."));
	
	 
	 driver.quit();		 
    }
}

