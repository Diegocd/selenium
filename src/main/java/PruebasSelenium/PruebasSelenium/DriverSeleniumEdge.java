package PruebasSelenium.PruebasSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSeleniumEdge extends DriverSelenium{
	
	public DriverSeleniumEdge() {
	System.setProperty("webdriver.edge.driver", "C:\\MicrosoftWebDriver.exe");
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	}

}
