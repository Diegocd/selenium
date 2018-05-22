package PruebasSelenium.PruebasSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSeleniumMain {
	
	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		try {
//		driver2.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");
//		driver2.getDriver().findElement(By.id("menuform:um_components")).click();
//		driver2.getDriver().findElement(By.id("menuform:um_sample")).click();
		Actions action = new Actions(driver.getDriver());
//		action.moveToElement(driver2.getDriver().findElement(By.id("j_idt50:dialog2")));
//		action.click();
//		action.perform();
//		driver2.getDriver().findElement(By.id("j_idt50:j_idt101")).sendKeys("Katakuri");
//		driver2.getDriver().findElement(By.id("j_idt50:j_idt105")).sendKeys("quetemochi");
//		driver2.getDriver().findElement(By.id("j_idt50:j_idt108")).click();
//		
//		driver2.getDriver().findElement(By.id("menuform:um_messages")).click();
//		driver2.getDriver().findElement(By.id("j_idt51:default")).sendKeys("Katakuri");
//		driver2.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("quetemochi");
//		driver2.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("Katakuri");
//		driver2.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("quetemochi");
//		action.moveToElement(driver2.getDriver().findElement(By.id("j_idt51:mtext_label")));
//		action.click();
//		action.perform();
//		
//		driver2.getDriver().findElement(By.id("j_idt51:mtext_2")).click();
//		driver2.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("quetemochi");
//		driver2.getDriver().findElement(By.id("j_idt51:submitButton")).click();
//		System.out.println(driver2.getDriver().findElement(By.id("j_idt51:j_idt54")).getText());
			driver.getDriver().get("https://www.eltiempo.es");
			driver.getDriver().findElement(By.id("inputSearch")).sendKeys("Écija" + Keys.ENTER);
			final WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Écija, Sevilla")));
			driver.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.className("m_table_weather_day_temp_wrapper")));
			driver.getDriver().findElements(By.className("m_table_weather_day_temp_wrapper")).stream()
			.filter(p -> p.getAttribute("outerHTML").contains("25 May, 14:00")).findFirst().get().click();
			
			driver.getDriver().findElements(By.className("table_tooltip_wrapper")).stream().
			forEach(p -> System.out.println(p.getText()));
			//driver.getDriver().findElement(By.className("form_select_predictive-name")).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}finally {
		driver.cerrarProceso();
		}
	}

}
