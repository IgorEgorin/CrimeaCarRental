package ru.crimearent.precondition;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class Precondition extends InstanceForAllPages{


    @BeforeMethod
    protected void setUpMethod() {

        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "Chrome";
        Configuration.timeout = 10000;
        Selenide.open("http://ccr456.testing.place/search?auto_class%5B%5D=3&auto_class%5B%5D=5&auto_class%5B%5D=8&auto_class%5B%5D=9&auto_class%5B%5D=10&auto_class%5B%5D=12&auto_class%5B%5D=13&start_city=76149c6a-44f4-11e5-aa23-bcee7b591456&start_date=08.08.2018&start_time=12&promocode=&end_city=76149c6a-44f4-11e5-aa23-bcee7b591456&end_date=15.08.2018&end_time=5");

    }

    @AfterClass
    public void quit() {
        Selenide.close();
    }
}

