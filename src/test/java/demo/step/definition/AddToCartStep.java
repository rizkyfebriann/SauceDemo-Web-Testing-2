package demo.step.definition;

import demo.pages.base.page.object.AddToCartPages;
import demo.pages.base.page.object.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddToCartStep {

    AddToCartPages addToCartPage = new AddToCartPages();
    LoginPages loginPages = new LoginPages();

    @And("user click add to cart")
    public void userclickAddToCartButton(){
        addToCartPage.clickAddToCart();
        addToCartPage.clickAddToCart1();
        addToCartPage.clickAddToCart2();
    }

    @Then("user can see the shopping cart added")
    public void userSuccessAddToCart(){
        Assert.assertTrue(addToCartPage.isSuccessAddToCart2());
    }
    //diatas buat scenario pertama


    @And("user already add item to cart")
    public void userAlreadyAddItemToCart() {
        addToCartPage.clickAddToCart();
        addToCartPage.clickAddToCart1();
        addToCartPage.clickAddToCart2();
        Assert.assertTrue(addToCartPage.isSuccessAddToCart2());
    }

    @And("user click remove button on item add")
    public void userClickRemoveButtonOnItemAdd() {
        addToCartPage.clickRemoveFromCart();
        addToCartPage.clickRemoveFromCart1();
        addToCartPage.clickRemoveFromCart2();
    }

    @Then("user can see item removed from shopping cart")
    public void userCanSeeItemRemovedFromShoppingCart() {
        addToCartPage.isSuccessRemovefromCart();
    }

    @And("user click sort dropdown")
    public void userClickSortDropdown() {
        addToCartPage.clickSortDropdown();
    }

    @Then("user choose Name \\(Z to A)")
    public void userChooseNameZToA() {
        addToCartPage.clickSortDropdown();
        addToCartPage.clickSortZtoA();
    }

    @And("user can see item sorted by name from Z to A")
    public void userCanSeeItemSortedByNameFromZToA() {
        addToCartPage.clickSortDropdown();
        addToCartPage.clickSortZtoA();
        addToCartPage.isSuccessSorted();
    }

    @Then("user choose Price \\(low to high)")
    public void userChoosePriceLowToHigh() {
        addToCartPage.clickSortDropdown();
        addToCartPage.clickSortPricelowtohigh();
    }

    @And("user can see item sorted by price from low to high")
    public void userCanSeeItemSortedByPriceFromLowToHigh() {
        addToCartPage.clickSortDropdown();
        addToCartPage.clickSortPricelowtohigh();
        addToCartPage.isSuccessSorted();
    }

    @Then("user choose Price \\(high to low)")
    public void userChoosePriceHighToLow() {
        addToCartPage.clickSortDropdown();
        addToCartPage.clickSortPricehightolow();
    }

    @And("user can see item sorted by price from high to low")
    public void userCanSeeItemSortedByPriceFromHighToLow() {
        addToCartPage.clickSortDropdown();
        addToCartPage.clickSortPricehightolow();
        addToCartPage.isSuccessSorted();
    }

    @And("user click sidebar")
    public void userClickSidebar() {
        loginPages.clickSidebar();
    }

    @And("user click logout button")
    public void userClickLogoutButton() {
        loginPages.clickLogout();
    }

    @Then("user is now logout from saucedemo")
    public void userIsNowLogoutFromSaucedemo() {
        loginPages.isOnLoginPage();
    }
}