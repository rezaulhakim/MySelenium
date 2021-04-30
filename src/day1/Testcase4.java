package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver drv= new ChromeDriver();
        drv.get("https://wellsfargo.com");
        drv.findElement(By.xpath("//input[@value='Sign on']")).click();










    }
}
