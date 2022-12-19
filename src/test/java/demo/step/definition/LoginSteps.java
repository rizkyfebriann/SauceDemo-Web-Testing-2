package demo.step.definition;

import demo.pages.base.page.object.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps {

    LoginPages loginPage = new LoginPages();

    @Given("user input {string} and {string}")
    public void inputUsernameAndPassword(String username, String password){
        loginPage.InputUsername(username);
        loginPage.InputPassword(password);
    }

    @And("user click login button")
    public void clickBtnLogin(){
        loginPage.clickButtonLogin();
    }

//    @And("user click sidebar button")
//    public void clickSidebarBtn(){
//        loginPage.clickSidebar();
//    }
//
//    @Then("user click logout")
//    public void clickLogoutBtn(){
//        loginPage.clickLogout();
//    }

    @Then("user success login with valid account")
    public void isLoginSuccess(){
        Assert.assertTrue(loginPage.isSuccessLogin());
//        Assert.assertTrue(loginPage.expectresult1());
    }

    @And("user login again with {string} and {string}")
    public void inputInvalidUsernameAndPassword(String username, String password){
        loginPage.InputInvalidUsername(username);
        loginPage.InputPassword(password);
    }

    @Then("user cannot login")
    public void isCannotLogin(){
        Assert.assertTrue(loginPage.isLockedAccount());
//        Assert.assertTrue(loginPage.expectresult2());
    }

}
