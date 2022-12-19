package demo.pages.base.page.object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class CheckoutItemPages extends BasePageObject {

    public void InputFirstName (String firstname) {
        By element = By.id("first-name");
        typeOn(element, firstname);
    }

    public void InputLastName (String lastname) {
        By element = By.id("last-name");
        typeOn(element, lastname);
    }

    public void InputZIPCode (String zipcode) {
        By element = By.id("postal-code");
        typeOn(element, zipcode);
    }

    public void continueToCheckoutOverview() {
        By element = By.id("continue");
        clickOn(element);
    }

    public boolean isOnCheckoutOverview (){
        By element = By.xpath("//span[contains(text(),'Checkout: Overview')]");
        return isPresent(element);
    }

    public void finishPayment() {
        By element = By.id("finish");
        clickOn(element);
    }

    public boolean isFinishedPayment (){
        By element = By.xpath("//span[contains(text(),'Checkout: Complete!')]");
        return isPresent(element);
    }

}
