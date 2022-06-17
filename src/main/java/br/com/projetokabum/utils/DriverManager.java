package br.com.projetokabum.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static WebDriver driver;
	
	public WebDriver abrirURL() throws Exception {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		
		DriverContext.setDriver(driver);
		return driver;
	}
}
