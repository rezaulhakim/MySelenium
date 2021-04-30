package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver drv= new ChromeDriver();
        drv.get("https://amazon.com");
        drv.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[3]/td[5]/a ")).click();











    }
}
