package PruebasSelenium.PruebasSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public abstract class DriverSelenium {
	
	static protected WebDriver driver;
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void takesScreenshot(String ruta, String nombre) {
		try {
			System.out.println("Realizando captura...");
			TakesScreenshot obj = (TakesScreenshot)driver;
			File origen = obj.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			File destino = new File(ruta + "\\" + nombre + ".png");
			System.out.println("Captura guardada en " + destino);
			FileUtils.copyFile(origen, destino);
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
	
	public void cerrarProceso() throws IOException {
		
		if (getDriver() instanceof DriverSeleniumFirefox) {
			
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
			
		} else if (getDriver() instanceof DriverSeleniumChrome){
			
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
						
		}else {
			
			Runtime.getRuntime().exec("taskkill /F /IM MicrosoftWebDriver.exe");
			
		}
		
		System.out.println("Prueba finalizada con Katakuri");
		
	}

}
