package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectingAll {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://homedepot.com");
        Thread.sleep(3000);
        List<WebElement>headersite= driver.findElements(By.xpath("//ul[@class='list list--type-plain']"));
        for(WebElement web :headersite){
            System.out.println(web.getText());

        }














    }
}
