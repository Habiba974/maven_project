package pages;

import definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class page_sc9 {
   public WebElement product(){
        WebElement p1= Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
        return p1;


    }
    public WebElement category(){
       WebElement categories=Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
       return categories;


    }

public WebElement cart1(){
WebElement p1_cart= Hooks.driver.findElement(By.id("add-to-cart-button-4"));
return p1_cart;
}
    public WebElement succMassage (){
       WebElement succ=Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
       return succ;

    }
public WebElement close_icon(){
   WebElement close= Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
   return close;


}
    public WebElement shopCart(){
       WebElement cart=Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
       return cart;


    }
    public WebElement tableCart(){
        WebElement table=Hooks.driver.findElement(By.cssSelector("div[class=\"page-body\"]"));
        return table;}
}
