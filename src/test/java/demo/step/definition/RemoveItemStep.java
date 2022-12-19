package demo.step.definition;

import demo.pages.base.page.object.AddToCartPages;
import demo.pages.base.page.object.RemoveItemPages;
import demo.pages.base.page.object.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class RemoveItemStep {

    RemoveItemPages removeItemPage = new RemoveItemPages();
    LoginPages loginPages = new LoginPages();
    AddToCartPages addToCartPage = new AddToCartPages();


    @And("user remove item from cart")
    public void userclickRemoveFromCartButton(){
        removeItemPage.clickShoppingCart();
        removeItemPage.clickRemoveItemFromCart();
    }

    @Then("item is removed from cart")
    public void isSuccessRemoved(){
        Assert.assertFalse(removeItemPage.isSuccessRemoveFromCart());
    }

    @Given("user already input valid username & password then login")
    public void userInputUsernameAndPassword() {
        loginPages.InputUsername("standard_user");
        loginPages.InputPassword("secret_sauce");
        loginPages.clickButtonLogin();
        loginPages.isSuccessLogin();
    }

    @Given("user already on product page")
    public void userAlreadyOnProductPage() {
        Assert.assertTrue(loginPages.isSuccessLogin());
    }

    @Given("user already add item on shopping cart")
    public void userAlreadyAddItemOnShoppingCart() {
        addToCartPage.clickAddToCart();
        addToCartPage.isSuccessAddToCart();
    }

    @Given("user already on Shopping cart page")
    public void userAlreadyOnShoppingCartPage() {
        removeItemPage.clickShoppingCart();
    }

    @And("user click continue shopping button")
    public void userClickContinueShoppingButton() {
        removeItemPage.continueShopping();
    }

    @Then("user back to Product page")
    public void userBackToProductPage() {
        Assert.assertTrue(loginPages.isSuccessLogin());
    }

    @And("user add item like tshirt and jacket")
    public void userAddItemLikeTshirtAndJacket() {
        addToCartPage.clickAddToCart1();
        addToCartPage.clickAddToCart2();
    }

    @Then("two item is added on the cart")
    public void twoItemIsAddedOnTheCart() {
        Assert.assertTrue(addToCartPage.isSuccessAddToCart1());
    }

    @And("user click Checkout button")
    public void userClickCheckoutButton() {
        removeItemPage.gotoCheckout();
    }

    @Then("user is on Checkout page now")
    public void userIsOnCheckoutPageNow() {
        removeItemPage.isCheckoutPage();
    }

    @And("user go to Shopping cart page")
    public void userGoToShoppingCartPage() {
        removeItemPage.clickShoppingCart();
    }
}