package demo.pages.base.page.object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class AddToCartPages extends BasePageObject {

    public void clickAddToCart() {
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
    }

    public void clickRemoveFromCart() {
        By element = By.id("remove-sauce-labs-backpack");
        clickOn(element);
    }

    public void clickAddToCart1() {
        By element = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
        clickOn(element);
    }

    public void clickRemoveFromCart1() {
        By element = By.id("remove-sauce-labs-bolt-t-shirt");
        clickOn(element);
    }

    public void clickAddToCart2() {
        By element = By.id("add-to-cart-sauce-labs-fleece-jacket");
        clickOn(element);
    }

    public void clickRemoveFromCart2() {
        By element = By.id("remove-sauce-labs-fleece-jacket");
        clickOn(element);
    }

    public boolean isSuccessAddToCart (){
        By element = By.xpath("//span[contains(text(),'1')]");
        return isPresent(element);
    }

    public boolean isSuccessAddToCart1 (){
        By element = By.xpath("//span[contains(text(),'2')]");
        return isPresent(element);
    }

    public boolean isSuccessAddToCart2 (){
        By element = By.xpath("//span[contains(text(),'3')]");
        return isPresent(element);
    }

    public boolean isSuccessRemovefromCart (){
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
        return isPresent(element);
    }

    public boolean isSuccessSorted (){
        By element = By.xpath("//*[@id=\"inventory_container\"]/div");
        return isPresent(element);
    }

    public void clickSortDropdown () {
        By element = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]");
        clickOn(element);
    }

    public void clickSortZtoA () {
        By element = By.xpath("//option[contains(text(),'Name (Z to A)')]");
        clickOn(element);
    }

    public void clickSortPricelowtohigh () {
        By element = By.xpath("//option[contains(text(),'Price (low to high)')]");
        clickOn(element);
    }

    public void clickSortPricehightolow () {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]");
        clickOn(element);
    }

}