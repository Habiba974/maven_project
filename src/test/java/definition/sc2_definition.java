package definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.page_sc2;

public class sc2_definition {
    page_sc2 home= new page_sc2();

@Given("user open login page")
    public void loginPage(){
    home.login().click();


}
@When("user enter login")
    public void user_enter_login(){

   home.loginbutton().click();
}
@Then("user can see my account display")
    public void navigate(){
    SoftAssert soft=new SoftAssert();

    System.out.println("home page");
    System.out.println(Hooks.driver.getCurrentUrl());
soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","home page");
    soft.assertTrue(home.my_account().isDisplayed());

    soft.assertAll();



}

}
