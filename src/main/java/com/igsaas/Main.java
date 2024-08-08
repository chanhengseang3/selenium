package com.igsaas;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://599.com/live/1552_2645861/bifen-4191254.html");
        sleep(5000);
        System.out.println(driver.getTitle());
        try {
            driver.navigate().refresh();
            sleep(5000);
            WebElement element = driver.findElement(By.className("half_score"));
            System.out.println(element.getText());
        } catch (NoSuchElementException e) {
            driver.navigate().refresh();
            sleep(5000);
        }
        driver.quit();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}