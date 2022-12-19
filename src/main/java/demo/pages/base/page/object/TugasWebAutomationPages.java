package demo.pages.base.page.object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class TugasWebAutomationPages extends BasePageObject {

    public void Input_Username (String username) {
        By element = By.xpath("//*[@id=\"user-name\"]");
        getDriver().findElement(element).clear();
        typeOn(element, username);
    }

    public void Input_Password (String password) {
        By element = By.id("password");
        getDriver().findElement(element).clear();
        typeOn(element, password);
    }

    public void clickButtonLogin1 () {
        By element = By.xpath("//*[@id=\"login-button\"]");
        clickOn(element);
    }

    public boolean isSuccessLogin1 (){
        By element = By.xpath("//span[contains(text(),'Products')]");
        return isPresent(element);
    }

    public void clickAddToCart_1 () {
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
    }

    public boolean isSuccess_AddToCart (){
        By element = By.xpath("//span[contains(text(),'1')]");
        return isPresent(element);
    }

    public boolean isSuccess_AddToCart1 (){
        By element = By.xpath("//span[contains(text(),'2')]");
        return isPresent(element);
    }

    public void clickSortDropdown1 () {
        By element = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]");
        clickOn(element);
    }

    public void clickSortZtoA1 () {
        By element = By.xpath("//option[contains(text(),'Name (Z to A)')]");
        clickOn(element);
    }

    public boolean isSuccessSorted1 (){
        By element = By.xpath("//*[@id=\"inventory_container\"]/div");
        return isPresent(element);
    }

    public void clickAddToCart_2() {
        By element = By.id("add-to-cart-sauce-labs-fleece-jacket");
        clickOn(element);
    }

    public void click_ShoppingCart() {
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]");
        clickOn(element);
    }

    public void continue_Shopping() {
        By element = By.id("continue-shopping");
        clickOn(element);
    }

    public void click_RemoveFromCart2() {
        By element = By.id("remove-sauce-labs-fleece-jacket");
        clickOn(element);
    }

}
