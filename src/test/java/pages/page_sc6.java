package pages;

import definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class page_sc6 {

    public WebElement slider(String sliderNumber){
WebElement element=Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNumber+"]"));
        return element;
    }




}
