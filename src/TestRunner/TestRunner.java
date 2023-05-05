package TestRunner;

import Repository.Login;
import Repository.OrderBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestRunner {

    public static WebDriver currClassDriver;

    Login objLogin;
    OrderBook objOrderBook;

    @Test(priority=1)
    public void userLoginDetails() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:\\\\geckodriver.exe");
        currClassDriver = new FirefoxDriver();
        Thread.sleep(8000);
        currClassDriver.get("http://product.hicare.in:9999/");
        Thread.sleep(5000);
        currClassDriver.manage().window().maximize();

        Thread.sleep(5000);
        objLogin = new Login(currClassDriver);
        objLogin.userLogin();
    }


        @Test(priority=2)
        public void bookOrder() throws InterruptedException {

        objOrderBook=new OrderBook(currClassDriver);
        objOrderBook.bookOrder();




        }





    }

