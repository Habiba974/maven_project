package definition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class sc3_definition {

    @Given("Select “Euro” from currency dropdown")
    public void dropdown(){
Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).click();

    }



}
