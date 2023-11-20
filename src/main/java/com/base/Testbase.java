package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testbase {
	public static Properties props;
	public FileInputStream file;
	public static WebDriver driver;

	public Testbase() throws Throwable {
		props = new Properties();
		try {
			file = new FileInputStream("./src/main/java/com/configprop/configprop");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			props.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public static void Initialization() {
		String browsername = props.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
		//	System.setProperty("webdriver.chrome.driver",
				//	"C:\\Users\\Admin\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64.zip\\msedgedriver.exe");
			driver=new EdgeDriver();
				
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(props.getProperty("url"));
		
	}



}
