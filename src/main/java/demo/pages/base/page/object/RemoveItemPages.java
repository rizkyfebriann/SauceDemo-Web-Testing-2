package demo.pages.base.page.object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class RemoveItemPages extends BasePageObject {

    public void clickRemoveItemFromCart() {
        By element = By.id("remove-sauce-labs-backpack");
        clickOn(element);
    }

    public void clickShoppingCart() {
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]");
        clickOn(element);
    }

    public void continueShopping() {
        By element = By.id("continue-shopping");
        clickOn(element);
    }

    public void gotoCheckout() {
        By element = By.id("checkout");
        clickOn(element);
    }

    public boolean isCheckoutPage (){
        By element = By.xpath("//span[contains(text(),'Checkout: Your Information')]");
        return isPresent(element);
    }

    public boolean isSuccessRemoveFromCart (){
        By element = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]");
        return isPresent(element);
    }



}