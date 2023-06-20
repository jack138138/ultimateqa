package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String MyBrowser = "Edge";

    static String MyUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver MyDriver;

    public static void main(String[] args) {
        if (MyBrowser.equalsIgnoreCase("Chrome")) {
            MyDriver = new ChromeDriver();

        } else if (MyBrowser.equalsIgnoreCase("Firefox")) {
            MyDriver = new FirefoxDriver();
        } else if (MyBrowser.equalsIgnoreCase("Edge")) {
            MyDriver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        MyDriver.get(MyUrl);
        MyDriver.manage().window().maximize();
        MyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print Page title
        System.out.println("My Page Title Is : " + MyDriver.getTitle());

        //Print Current URL
        System.out.println("My Page Url Is :" + MyUrl);

        //Print source
        System.out.println("My Page Source Is : " + MyDriver.getPageSource());

        //Enter Email in Email Field
        MyDriver.findElement(By.name("user[email]")).sendKeys("JaydeePrime@Testing.com");

        //Enter Password in Password Field
        MyDriver.findElement(By.id("user[password]")).sendKeys("PrimeTesting");

        //Close Browser
        MyDriver.close();


    }


}
