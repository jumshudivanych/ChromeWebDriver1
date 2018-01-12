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


    public static void main( String[] args )
    {
        //инициализация дочернего потока
        Runnable ChromeDriver1 = new com.sandbox50572.ChromeDriver("ChromeDriver1");

        //инициализация дочернего потока
        Runnable ChromeDriver2 = new com.sandbox50572.ChromeDriver("ChromeDriver2");

        //цикл запускающий потки
        for(int i=3; i>0; i--) {

            //запуск первого потока
            ChromeDriver1.run();

            //запуск второго потока
            ChromeDriver2.run();
        }

    }
}
