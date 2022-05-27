package pages;

import definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class page_sc8 {

     public WebElement success_notification(){
        WebElement succNot= Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return succNot;

    }
  public WebElement select_category(){
         WebElement sel_category=  Hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]"));
         return sel_category;

  }
    public WebElement wishList(){
         WebElement wish=Hooks.driver.findElement(By.id("add-to-wishlist-button-38"));
         return wish;

    }
    public WebElement wishList2(){
        WebElement wish2=Hooks.driver.findElement(By.id("add-to-wishlist-button-18"));
        return wish2;}


    public WebElement wishList_close(){
        WebElement icon=Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
        return icon;}



}
