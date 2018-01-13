package com.sandbox50572;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Проба организации многопоточнои работы
 * ChromeDriver
 */
public class App 
{


    public static void main( String[] args ) throws InterruptedException {
        //создание объекта
        Runnable chromeDriver1 = new com.sandbox50572.ChromeDriver("ChromeDriver1", "https://sandbox50572.wordpress.com/");
        //создание дочернего потока
        Thread thread2 = new Thread(chromeDriver1);
        //стартуем новыи поток
        thread2.start();

        //Пауза
        Thread.sleep(30000);

        //инициализация дочернего потока
        Runnable chromeDriver2 = new com.sandbox50572.ChromeDriver("ChromeDriver2", "https://sandbox50572.wordpress.com/");
        //создание дочернего потока
        Thread thread3 = new Thread(chromeDriver2);
        //стартуем новыи поток
        thread3.start();

        System.out.println("Метод main завершен.");

    }
}
