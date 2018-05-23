package PruebasSelenium.PruebasSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DriverSeleniumChrome extends DriverSelenium {


	public DriverSeleniumChrome() {

		// Indicamos la ruta del driver que levantara firefox
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

		// Maximizar la ventana
		driver.manage().window().maximize();

	}
}
