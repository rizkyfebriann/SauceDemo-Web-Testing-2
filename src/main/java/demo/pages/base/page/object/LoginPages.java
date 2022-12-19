package demo.pages.base.page.object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static demo.utils.constants.timeout;


public class LoginPages extends BasePageObject {

    public void InputUsername (String username) {
        By element = By.xpath("//*[@id=\"user-name\"]");
        getDriver().findElement(element).clear();
        typeOn(element, username);
    }

    public void InputInvalidUsername (String username) {
        By element = By.xpath("//*[@id=\"user-name\"]");
        getDriver().findElement(element).clear();
        typeOn(element, username);
    }

    public void InputPassword (String password) {
        By element = By.id("password");
        getDriver().findElement(element).clear();
        typeOn(element, password);
    }

    public void clickButtonLogin () {
        By element = By.xpath("//*[@id=\"login-button\"]");
        clickOn(element);
    }

    public boolean isSuccessLogin (){
        By element = By.xpath("//span[contains(text(),'Products')]");
        return isPresent(element);
    }

    public boolean isLockedAccount (){
        By element = By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div/form/div[3]");
        return isPresent(element);
    }

    public void clickSidebar () {
        By element = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button");
        waitUntil(ExpectedConditions.elementToBeClickable(element), timeout);
        clickOn(element);
    }

    public void clickLogout () {
        By element = By.id("logout_sidebar_link");
        clickOn(element);
    }

    public boolean isOnLoginPage (){
        By element = By.xpath("//*[@id=\"root\"]/div/div[2]");
        return isPresent(element);
    }

//    public boolean expectresult1 (){
//        By element = By.xpath("//span[contains(text(),'Products')]");
//        return isPresent(element);
//    }
//
//    public boolean expectresult2 (){
//        By element = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
//        return isPresent(element);
//    }

}
