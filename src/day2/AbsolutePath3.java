package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath3 {
    public static void main(String[]args){



        System.setProperty("webdriver.chrome.driver","C://Users//rezau//IdeaProjects//MySelenium//driver//chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.com");
        driver.findElement(By.xpath("")).click();










    }
}
