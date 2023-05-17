package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {

    public static  void selectElementByText(By by , String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectElementByValue(By by , String value){
        Select select = new Select(driver.findElement(by)) ;
        select.selectByValue(value);
    }
    public static void selectElementByIndex(By by , int number){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(number);
    }

    //this method will click on element
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }


    //this method will send text on element
    public static void typeText(By by , String text)
    {
        driver.findElement(by).sendKeys(text);
    }


    //this method will get text from element
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    public static String  currentTimesStamp(){
        Date date = new Date();
        SimpleDateFormat Sdf =new
                SimpleDateFormat("ddMMyyhhmmSS") ;
        return Sdf.format(date);



    }
    public static void captureScreenshot(String fileName){

        //convert web driver object to TakeScreenshot
        TakesScreenshot screenshot = ((TakesScreenshot)driver) ;

        //call getScreenshotAs metrhod to create image file
        File
                SrcFile=screenshot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destFile=new
                File("src\\test\\Screenshots\\"+fileName+""+currentTimesStamp()+".Png");

        //copy file at destination
        try {
            FileUtils.copyFile(SrcFile,destFile);

        } catch (IOException e){
            e.printStackTrace();
        }


    }


    public static long timeStamp() {
        java.sql.Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        return timestamp1.getTime();

    }

    public static void acceptAlert(){
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }

    //this method will dismissAlert
    public static void dismissAlert(){
        Alert alert =driver.switchTo().alert();
        alert.dismiss();
    }

    //reusable method is explicit wait untill condition of visiblity element
    public static void explicitWait_VisibilityofElementLocated(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Reusable method is explicit wait to wait until condition Element
    public static void explicitWait_ElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Reusable method is explicit wait to wait until condition of Invisibility of Element
    public static void explicitWait_InvisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // Reusable method is explicit wait to wait until condition of Text to be present in element
    public static void explicitWait_TextToBePresentInElementLocated(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }
    public static void scrollViewElement(By by) {

        WebElement element = driver.findElement(by);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.getText());
    }
    public static String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public static void explicitWait_UrlMatches(String url){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlMatches(url));
    }


}