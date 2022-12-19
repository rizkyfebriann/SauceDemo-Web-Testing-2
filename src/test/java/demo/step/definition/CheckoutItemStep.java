package demo.step.definition;

import demo.pages.base.page.object.AddToCartPages;
import demo.pages.base.page.object.CheckoutItemPages;
import demo.pages.base.page.object.LoginPages;
import demo.pages.base.page.object.RemoveItemPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutItemStep {

    CheckoutItemPages checkoutItemPage = new CheckoutItemPages();
//    LoginPages loginPage = new LoginPages();
//    AddToCartPages addToCartPage = new AddToCartPages();
//    RemoveItemPages removeItemPage = new RemoveItemPages();
//
//    @Given("user input {string} and {string}")
//    public void inputUsernameAndPassword(String username, String password){
//        loginPage.InputUsername(username);
//        loginPage.InputPassword(password);
//    }
//
//    @And("user click login button")
//    public void clickBtnLogin(){
//        loginPage.clickButtonLogin();
//    }
//
//    @Then("user success login")
//    public void isLoginSuccess(){
//        Assert.assertTrue(loginPage.isSuccessLogin());
//    }
//
//    @And("user click add to cart")
//    public void userclickAddToCartButton(){
//        addToCartPage.clickAddToCart();
//    }
//
//    @Then("user can see the shopping cart added")
//    public void userSuccessAddToCart(){
//        Assert.assertTrue(addToCartPage.isSuccessAddToCart());
//    }
//
//    @And("user click shopping cart")
//    public void userAlreadyOnShoppingCartPage() {
//        removeItemPage.clickShoppingCart();
//    }
//
//    @And("user click checkout button")
//    public void userClickCheckoutButton() {
//        removeItemPage.gotoCheckout();
//    }
//
    @And("user input {string} and {string} and {string}")
    public void inputData(String firstname, String lastname, String ZIPCode){
        checkoutItemPage.InputFirstName(firstname);
        checkoutItemPage.InputLastName(lastname);
        checkoutItemPage.InputZIPCode(ZIPCode);
    }

    @And("user click continue button")
    public void userClickCheckout() {
        checkoutItemPage.continueToCheckoutOverview();
    }

    @Then("user can see checkout overview")
    public void userOnCheckoutOverview(){
        Assert.assertTrue(checkoutItemPage.isOnCheckoutOverview());
    }

    @And("user click finish button")
    public void userClickFinish() {
        checkoutItemPage.finishPayment();
    }

    @Then("user can see success checkout")
    public void userSuccessCheckout(){
        Assert.assertTrue(checkoutItemPage.isFinishedPayment());
    }
}
