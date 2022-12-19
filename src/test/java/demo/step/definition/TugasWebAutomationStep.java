package demo.step.definition;

import demo.pages.base.page.object.TugasWebAutomationPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TugasWebAutomationStep {

    TugasWebAutomationPages tugasWebAutomationPage = new TugasWebAutomationPages();


    @Given("user login with {string} and {string}")
    public void userLoginWithAnd(String username, String password) {
        tugasWebAutomationPage.Input_Username("standard_user");
        tugasWebAutomationPage.Input_Password("secret_sauce");
        tugasWebAutomationPage.clickButtonLogin1();
        tugasWebAutomationPage.isSuccessLogin1();
    }

    @Then("add one item to cart")
    public void addItemToCart() {
        tugasWebAutomationPage.clickAddToCart_1();
    }

    @Given("user already add one item to cart")
    public void userAlreadyAddItemToCart() {
        tugasWebAutomationPage.isSuccess_AddToCart();
    }

    @And("user sort all item on Product page by Name \\(Z to A)")
    public void userSortAllItemOnProductPageByNameZToA() {
        tugasWebAutomationPage.clickSortDropdown1();
        tugasWebAutomationPage.clickSortZtoA1();
        tugasWebAutomationPage.isSuccessSorted1();
    }

    @And("user add first sorted item \\(jacket)")
    public void userAddFirstSortedItemJacket() {
        tugasWebAutomationPage.clickAddToCart_2();
    }

    @Then("user see two item now added on shopping cart")
    public void userSeeTwoItemNowAddedOnShoppingCart() {
        tugasWebAutomationPage.isSuccess_AddToCart1();
    }

    @And("user go to shopping cart page")
    public void userGoToShoppingCartPage() {
        tugasWebAutomationPage.click_ShoppingCart();
    }

    @And("user remove last added item on shopping cart")
    public void userRemoveLastAddedItemOnShoppingCart() {
        tugasWebAutomationPage.click_RemoveFromCart2();
    }

    @Then("user continue shopping again")
    public void userContinueShoppingAgain() {
        tugasWebAutomationPage.continue_Shopping();
    }
}
