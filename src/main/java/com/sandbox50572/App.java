package com.sandbox50572;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ChromeDriver driver;
    private static String url;

    public static void main( String[] args )
    {
        url = "https://sandbox50572.wordpress.com/";//url загружаемои страницы
        //TODO ЗАПУСК Chrome
        System.setProperty("webdriver.chrome.driver","C:/idea/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //неявное ожидание действует всякий раз при поиске элемента
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //url = "https://sandbox50572.wordpress.com";TODO обработать как настроики по умолчанию
        driver.get(url);
        // WebElement hrefButton = driver.findElement(By.xpath("//button[text()='Автозагрузчик']"));//TODO проверить соответствие!!!
        WebElement hrefButton = driver.findElementByLinkText("Автозагрузчик");//находим элемент
        //нажать на кнопку
        hrefButton.click();



        //TODO переписать
        try {
            Thread.sleep(180000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("http://google.com");//пробуем открыть еще одну вкладку

        //TODO засыпаем
        try {
            Thread.sleep(180000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();//завершение работы браузера

    }
}
