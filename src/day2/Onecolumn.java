package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Onecolumn {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://walmart.com");
        Thread.sleep(3000);
        WebElement drv = driver.findElement(By.xpath("//*[@id='js-global-footer-wrapper']/div/div[2]/div/div[1]/ul"));
        System.out.println(drv.getText());









    }
}
