package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver drv= new ChromeDriver();
        drv.get("https://Wellsfargo.com");
        drv.findElement(By.xpath("//a[@id='wealthTab']")).click();




    }
}
