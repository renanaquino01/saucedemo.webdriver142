// 0 pacotes

// 1 bibliotecas
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.commons.annotation.Testable;
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

// 2 classe
public class saucedemoTest {
    // 2.1 atributos e variaveis
public WebDriver driver;
public Map<String, Object> vars;
    JavascriptExecutor js;
  
    // 2.2 funcoes e metodos
    @BeforeEach
    public void inciar() {
      driver = new ChromeDriver();
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
      driver.quit();
    }
    @Test
    public void saucedemo() {
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().setSize(new Dimension(1382, 736));
      driver.findElement(By.cssSelector(".login_credentials_wrap-inner")).click();
      driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
      driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
      driver.findElement(By.cssSelector(".error-message-container")).click();
      driver.findElement(By.cssSelector("*[data-test=\"login-password\"]")).click();
      driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
      driver.findElement(By.cssSelector(".error-message-container")).click();
      driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
      driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
      driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
      driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")).click();
      driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
    }
  }
