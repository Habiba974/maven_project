package definition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.page_sc6;

public class sc6_definition {
    page_sc6 home=new page_sc6();
    @When("user click in slider wrapper1")
    public void slider_wrapper(){
       home.slider("1").click();

    }
@Then("nokia page open")
    public void page_open(){
    SoftAssert soft=new SoftAssert();
    soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","nokia");
    soft.assertAll();
}
@When("user click in slider wrapper2")
    public void wrapper2()  {
    Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        home.slider("2").click();


}
@Then("iphone page open")
    public void iphone()throws InterruptedException{
        Thread.sleep(3000);
    SoftAssert soft=new SoftAssert();
    soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iPhone_s6","iphone");
    soft.assertAll();

}
}
