package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class sc5_defintion {
    @Given("user writ any product in search")
    public void search(){

        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("lenovo");

    }

@When("user click search button")
    public void search_button(){
      Hooks.driver.findElement(By.className("button-1")) .click();

}
@Then("user go to page1")
public void page1(){
    SoftAssert soft=new SoftAssert();
    System.out.println(Hooks.driver.getCurrentUrl());

    soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=lenovo","search1");
    soft.assertAll();
}

@And("user can search for product by using SKU")
    public void using_SKU(){
    Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("CS_TSHIRT");



}
@When("user click search button2")
    public void search_button2(){
    Hooks.driver.findElement(By.className("button-1")) .click();


}
@Then("user go to page")
    public void page(){
    SoftAssert soft=new SoftAssert();
    System.out.println(Hooks.driver.getCurrentUrl());

    soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=CS_TSHIRT","search2");
    soft.assertAll();

}
}
