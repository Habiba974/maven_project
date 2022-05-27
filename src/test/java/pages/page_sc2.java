package pages;

import definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class page_sc2
{
    public WebElement login(){
        WebElement log= Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return log;

    }
    public WebElement loginbutton(){
        WebElement button=  Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] button[type=\"submit\"]"));
        return button;

    }

    public WebElement my_account(){
        WebElement my= Hooks.driver.findElement(By.className("ico-account"));
        return my;}




}
