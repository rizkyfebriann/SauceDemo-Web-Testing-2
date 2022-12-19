package demo.hooks;

import demo.webdriver.WebdriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import static demo.webdriver.WebdriverInstance.*;

public class WebdriverHooks {
  @Before(value = "@Web")
  public void initializeWebdriver() {
    initialize();
  }

  @After(value = "@Web")
  public void quitWebdriver(Scenario scenario) {
    if (scenario.isFailed()) {
      try{
        final byte[] data = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(data, "image/png", "Failed Screenshot");
      } catch (WebDriverException e) {
        e.printStackTrace();
      }
    }
    quit();
  }
}
