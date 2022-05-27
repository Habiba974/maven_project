package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


public class sc7_definition {
    SoftAssert soft = new SoftAssert();

    @Given("user go to follow us and click in facebook icon")

    public void facebook_icon() {
        Hooks.driver.findElement(By.className("facebook")).click();


    }

    @And("user will go to page in facebook")
    public void facebook() {

        String Actualtext = Hooks.driver.findElement(By.linkText("Facebook")).getAttribute("href");
        soft.assertEquals(Actualtext, "http://www.facebook.com/nopCommerce");
        System.out.println("URL matching --> Part executed");
        soft.assertAll();
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @And("user go to follow us and click in twitter icon")
    public void twitter_icon() {
        Hooks.driver.findElement(By.className("twitter")).click();

    }

    @Then("user will go to page in twitter")
    public void twitter() {
        String Actualtext2 = Hooks.driver.findElement(By.linkText("Twitter")).getAttribute("href");
        soft.assertEquals(Actualtext2, "https://twitter.com/nopCommerce");
        System.out.println("URL matching --> Part executed2");

        soft.assertAll();
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user go to follow us and click in youtube icon")
    public void youtube_icon() {

        Hooks.driver.findElement(By.className("youtube")).click();
    }

@Then("user will go to page in youtube")
    public void youtube(){
    String Actualtext3 = Hooks.driver.findElement(By.linkText("YouTube")).getAttribute("href");
    soft.assertEquals(Actualtext3, "http://www.youtube.com/user/nopCommerce");
    System.out.println("URL matching --> Part executed3");

    soft.assertAll();

}
}
