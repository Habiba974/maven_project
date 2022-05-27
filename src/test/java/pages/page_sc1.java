package pages;

import definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class page_sc1 {
    public WebElement register(){
        WebElement reg= Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }

    public WebElement gender(){
        WebElement gen= Hooks.driver.findElement(By.id("gender-male"));
        return gen;
    }

    public WebElement fristName(){
        WebElement first= Hooks.driver.findElement(By.id("FirstName"));
        return first;}

    public WebElement lastName(){
        WebElement last=  Hooks.driver.findElement(By.id("LastName"));
        return last;}

    public WebElement dayDate(){
        WebElement day= Hooks.driver.findElement(By.cssSelector("option[value=\"20\"]"));
        return day;}

    public WebElement monthDate(){
        WebElement month= Hooks.driver.findElement(By.cssSelector("option[value=\"11\"]"));
        return month;}

    public WebElement yearDate(){
        WebElement year= Hooks.driver.findElement(By.cssSelector("option[value=\"1998\"]"));
        return year;}

    public WebElement email(){
        WebElement e= Hooks.driver.findElement(By.id("Email"));
        return e;}

    public WebElement companyName(){
        WebElement name= Hooks.driver.findElement(By.id("Company"));
        return name;}

    public WebElement password(){
        WebElement pass=  Hooks.driver.findElement(By.id("Password"));
        return pass;}
}
