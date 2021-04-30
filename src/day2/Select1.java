package day2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Select1 {
    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://homedepot.com");
        Thread.sleep(3000);
        WebElement categories= driver.findElement(By.xpath("//section[@id='simplePanelMain']/ul[2]/li[1]/a"));
        Select select=new Select(categories);




















    }
}
