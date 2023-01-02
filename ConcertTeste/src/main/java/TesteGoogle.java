
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
		Assert.assertEquals("Google", driver.getTitle()); // validar se é a pagina do Google
				
		//driver.quit();
		
		
	}
@Test
	
	
	public void  efetuarPesquisa() {			
	
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		WebElement searchInput = driver.findElement(By.name("q"));
	    searchInput.sendKeys("site concert" + Keys.ENTER );
	    Assert.assertEquals("site concert - Pesquisa Google", driver.getTitle());
		
	  //driver.quit();
		
		

}
}
