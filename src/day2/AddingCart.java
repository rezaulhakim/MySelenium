package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCart {
    public static void main(String[]args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","C:/Users/rezau/IdeaProjects/MySelenium/driver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://etsy.com");
        driver.findElement(By.linkText("Home & Living")).click();
        driver.findElement(By.linkText("Home Décor")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/div[3]/div[2]/div[2]/ul[6]/li[1]/div/div[1]/a/div[2]")).click();




















    }
}
