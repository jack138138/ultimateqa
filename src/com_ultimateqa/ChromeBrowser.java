package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

        String MyUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Setup Chrome Browser
        WebDriver MyDriver = new ChromeDriver();

        //Open Url
        MyDriver.get(MyUrl);

        //Maximise Url
        MyDriver.manage().window().maximize();

        //Implicit
        MyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the Title Of the page
        System.out.println("My Page Title is:" + MyDriver.getTitle());

        //Print the Url
        System.out.println("My Page Url is : " + MyUrl);

        //Print the page source
        System.out.println("My PageSourceCode is: " + MyDriver.getPageSource());

        //Enter Email into the email Field
     MyDriver.findElement(By.id("user[email]")).sendKeys("JaydeePrime@Testing.com");


      //Enter Password In Password field
    MyDriver.findElement(By.id("user[password]")).sendKeys("PrimeTesting");


        //Close Driver
        MyDriver.close();








    }

}
