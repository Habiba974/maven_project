package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import pages.page_sc4;

public class sc4_definition {
    page_sc4 home=new page_sc4();
    @Given("user chose any category")
    public void chose_any_category(){
   home.category1().click();


    }
@And("select a product")public void product(){
       home.cateProduct().click();


}
@And("user chose anther category")
    public void category2(){
home.category2().click();


}
@And("user chose anther product")

    public void product2(){

        Hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]")).click();
   Hooks.driver.findElement(By.xpath("//a[@href=\"/fahrenheit-451-by-ray-bradbury\"]")).click();
}
}
