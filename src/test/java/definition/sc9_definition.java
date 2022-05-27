package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.page_sc9;

public class sc9_definition {
    page_sc9 home=new page_sc9();
    @Given("user chose product that he want")
    public void selectProduct(){
       home.product().click();

    }
@When("add to cart")
    public void cart1(){
      home.cart1().click();

}
@Then("success massage will show")
    public void succ_massage(){
    SoftAssert soft=new SoftAssert();

    soft.assertTrue(home.succMassage ().isDisplayed());
    soft.assertAll();
    Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
}

@And("add product by category")
    public void add_product_by_category(){
home.category().click();
    Hooks.driver.findElement(By.cssSelector("img[alt=\"Picture for category Accessories\"]")).click();
}
@And("chose  product")
    public void chose_product()
{
    Hooks.driver.findElement(By.cssSelector("a[href=\"/ray-ban-aviator-sunglasses\"]")).click();

}
@When("add product")
    public void product22(){
     Hooks.driver.findElement(By.id("add-to-cart-button-33")) .click();

}
@Then("success  will show")
public void succMassage(){
    SoftAssert soft=new SoftAssert();

    soft.assertTrue(home.succMassage().isDisplayed());
    soft.assertAll();}


    @Then("table of shop cart will show")
    public void shop_cart(){
        home.close_icon().click();
        home.shopCart().click();
        SoftAssert soft=new SoftAssert();

        soft.assertTrue(home.tableCart().isDisplayed());
        soft.assertAll();

    }
}





