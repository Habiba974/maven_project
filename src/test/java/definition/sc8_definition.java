package definition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.page_sc8;

public class sc8_definition {
    SoftAssert soft=new SoftAssert();
    page_sc8 home=new page_sc8();



    @Given("user select product by category")
    public void click_on_product(){
      home.select_category().click();
        Hooks.driver.findElement(By.cssSelector("a[href=\"/first-prize-pies\"]")).click();

    }
@When("click on product to add to wish list")
public void add_to_wish_list(){

    home.wishList().click();

}
@Then("Success massage will show")
public void Success_massage_will_show(){


    soft.assertTrue(home.success_notification().isDisplayed());
    soft.assertAll();
}

@And("user click on product2 wish icon")
    public void product2_wish(){
    Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
Hooks.driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();


}
@When("click on product2 to add to wish list")
    public void product2(){
    home.wishList2().click();

}
    @Then("Success2 massage will show")
    public void Success2_massage_will_show(){


        soft.assertTrue(home.success_notification().isDisplayed());
        soft.assertAll();


    }


  @Then("wish list table will show")
    public void table_will_show(){
        home.wishList_close().click();
Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]")).click();


      soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"wishlist-content\"]")).isDisplayed());
      soft.assertAll();


  }
}

