package com.example.black_box;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ImagematchessiggestedrecipeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void imagematchessiggestedrecipe() {
    driver.get("http://localhost:8080/homepage");
    driver.manage().window().setSize(new Dimension(1792, 1120));
    driver.findElement(By.id("height")).click();
    driver.findElement(By.id("height")).sendKeys("177");
    driver.findElement(By.id("weight")).click();
    driver.findElement(By.id("weight")).sendKeys("90");
    driver.findElement(By.id("age")).click();
    driver.findElement(By.id("age")).sendKeys("20");
    driver.findElement(By.cssSelector("div:nth-child(18) > label:nth-child(2)")).click();
    driver.findElement(By.id("4")).click();
    driver.findElement(By.id("7")).click();
    driver.findElement(By.id("btn")).click();
    vars.put("photoinapp", driver.findElement(By.cssSelector(".column:nth-child(3) img")).getText());
    driver.findElement(By.linkText("Click To View")).click();
    driver.findElement(By.cssSelector(".post-header-image .image__img")).click();
    vars.put("photoinweb", driver.findElement(By.cssSelector(".post-header-image .image__img")).getText());
    if ((Boolean) js.executeScript("return (arguments[0]=arguments[1])", vars.get("photoinapp"),vars.get("photoinweb"))) {
    }
    driver.close();
  }
}
