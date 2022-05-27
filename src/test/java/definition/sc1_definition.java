package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.page_sc1;


public class sc1_definition {
    page_sc1 home=new page_sc1();


@Given("user open register page")
    public void registerPage(){
    home.register().click();}

@And("user chose his gender")
    public void gender(){
    home.gender().click();


}
@And("user put his first and last name")
    public void first_and_LastName(){
   home.fristName().sendKeys("Aly");
   home.lastName().sendKeys("omer");

}
@And("user put his birthday data")
    public void birthday_data(){
    home.dayDate().click();
    home.monthDate().click();
    home.yearDate().click();
}
@And("^user put his email\"(.*)\"$")
    public void email(String email){

    home.email().sendKeys("aliaa@gmial.com");
}
@And("user put his Company name")
    public void CompanyName(){
    home.companyName().sendKeys("ibm");}

    @And("^user put his password\"(.*)\"$")
    public void password_and_Confirm_password(String password){
   home.password().sendKeys("1234567");


}
@And("user put his Confirm password")
public void Confirm(){


    Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");
}
@When("user enter register")
    public void enterRegister(){
    Hooks.driver.findElement(By.id("register-button")).click();

}
@Then("success massage will appear")
    public void successMassage(){

    SoftAssert soft=new SoftAssert();

    soft.assertTrue(Hooks.driver.findElement(By.className("result")).isDisplayed());
soft.assertAll();

String color=Hooks.driver.findElement(By.className("result")).getCssValue("color");
    System.out.println("color:"+ color);
    //user log out to do sc2 login
    Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"]")).click();
}



}
