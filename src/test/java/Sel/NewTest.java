package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver w;
  @Test
  public void f() {
	  w.get("http://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
	  w=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  w.quit();
  }

}
