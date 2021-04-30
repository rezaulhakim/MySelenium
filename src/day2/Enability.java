package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enability {
    public static void main(String[]args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://instagram.com");
        Thread.sleep(3000);
        WebElement password =driver.findElement(By.xpath("//form[@class='HmktE']/div/div[2]/div/label/input"));
        System.out.println(password.isEnabled());














    }
}
