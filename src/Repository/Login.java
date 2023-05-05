package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Scanner;

public class Login {

    WebDriver driver;

    By LinkBtn=By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a");
    By txtMobNo= By.xpath("//input[contains(@id,'user_mobile')]");
    By btnOtp=By.xpath("//button[contains(@id,'sendotp')]");
    By txtOtp=By.xpath("//input[contains(@id,'user_otp')]");
    By btnLogin=By.xpath("//input[contains(@id,'btn_login')]");



    //Constructor to use webdriver into another class
    public Login(WebDriver driverParam){

        this.driver=driverParam;
    }


    //Login Method Implementation
    public void userLogin() throws InterruptedException {

        driver.findElement(LinkBtn).click();
        Thread.sleep(5000);

        driver.findElement(txtMobNo).sendKeys("9769283591");
        Thread.sleep(5000);

        driver.findElement(btnOtp).click();
        Thread.sleep(5000);


        Scanner scanner_user = new Scanner(System.in);
        System.out.println("Enter the OTP: " );
        String user = scanner_user.nextLine();
        scanner_user.close();
        Thread.sleep(6000);
        driver.findElement(txtOtp).sendKeys(user);

        Thread.sleep(5000);
        driver.findElement(btnLogin).click();




    }
}
