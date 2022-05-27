package pages;

import definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class page_sc4 {
    public WebElement category1(){
        WebElement cate1= Hooks.driver.findElement(By.xpath("//a[@href=\"/jewelry\"]"));
        return cate1;
    }

        public WebElement cateProduct (){
            WebElement cate_pro=  Hooks.driver.findElement(By.xpath("//a[@href=\"/elegant-gemstone-necklace-rental\"]"));
            return cate_pro;
        }
    public WebElement category2(){
        WebElement cate2= Hooks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
        return cate2;
    }

}
