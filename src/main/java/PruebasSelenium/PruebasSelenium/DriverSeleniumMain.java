package PruebasSelenium.PruebasSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.management.timer.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSeleniumMain {

	public static void main(String[] args) throws IOException, InterruptedException {
		// DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
		DriverSeleniumEdge driver2 = new DriverSeleniumEdge();
		try {
			 driver2.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");
			 driver2.getDriver().findElement(By.id("menuform:um_components")).click();
			 driver2.getDriver().findElement(By.id("menuform:um_sample")).click();
			 final WebDriverWait wait = new WebDriverWait(driver2.getDriver(), 20);
			 wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt50:dialog2")));
			 Actions action = new Actions(driver2.getDriver());
			 action.moveToElement(driver2.getDriver().findElement(By.id("j_idt50:dialog2")));
			 action.click();
			 action.perform();
			 driver2.getDriver().findElement(By.id("j_idt50:j_idt101")).sendKeys("Katakuri");
			 driver2.getDriver().findElement(By.id("j_idt50:j_idt105")).sendKeys("quetemochi");
			 driver2.getDriver().findElement(By.id("j_idt50:j_idt108")).click();
			 driver2.getDriver().findElement(By.id("menuform:um_messages")).click();
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt51:default")));
			 driver2.getDriver().findElement(By.id("j_idt51:default")).sendKeys("Katakuri");
			 driver2.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("quetemochi");
			 driver2.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("Katakuri");
			 driver2.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("quetemochi");
			 action.moveToElement(driver2.getDriver().findElement(By.id("j_idt51:mtext_label")));
			 action.click();
			 action.perform();
			
			 driver2.getDriver().findElement(By.id("j_idt51:mtext_2")).click();
			 driver2.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("quetemochi");
			 driver2.getDriver().findElement(By.id("j_idt51:submitButton")).click();
			 System.out.println(driver2.getDriver().findElement(By.id("j_idt51:j_idt54")).getText());
			 driver2.getDriver().get("https://www.eltiempo.es");
			 //Boolean isPresent = driver2.getDriver().findElements(By.id("privacy_bar_close")).size() > 0;
			 
//			 if(driver2.getDriver().findElements(By.id("privacy_bar_close")).size() > 0) {
//			 wait.until(ExpectedConditions.elementToBeClickable(By.id("privacy_bar_close")));
//			 driver2.getDriver().findElement(By.id("privacy_bar_close")).click();
//			 }
			 
			 driver2.getDriver().findElement(By.id("inputSearch")).sendKeys("Écija" +
			 Keys.ENTER);
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Écija, Sevilla")));
			 driver2.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.className("m_table_weather_day_temp_wrapper")));
			 driver2.getDriver().findElements(By.className("m_table_weather_day_temp_wrapper")).stream()
			 .filter(p -> p.getAttribute("outerHTML").contains("25 May, 14:00")).findFirst().get().click();
			
			 driver2.getDriver().findElements(By.className("table_tooltip_wrapper")).stream().
			 forEach(p -> System.out.println(p.getText()));
			 driver2.getDriver().get("https://www.google.es");
			 driver2.getDriver().findElement(By.id("lst-ib")).sendKeys("PAATAAATAAAAAAA");
			 TimeUnit.SECONDS.sleep(5);
			 driver2.takesScreenshot("C:\\Users\\formacion\\Desktop", "captura");
			 
			 driver2.getDriver().quit();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} finally {
			driver2.cerrarProceso();
		}
	}

}
