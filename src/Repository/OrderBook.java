package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrderBook {

    WebDriver driver;

    By LinkProduct = By.xpath("/html/body/div[1]/header/div[2]/div/div/nav/div/ul/li[2]/a[1]");
    By LinkRefillStarter = By.xpath("/html/body/div[1]/header/div[2]/div/div/nav/div/ul/li[2]/div/div/div[3]/ul/li[2]/a");
    By btnAddToCart = By.xpath("//*[@id=\"page\"]/main/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/a");

    By LinkCart = By.xpath("//a[contains(@id,'cart-count')]");

    By btnProceedToCheckout = By.xpath("//a[contains(@id,'btn-proceed-to-cart')]");

    By spanPointer = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div/span");

    By btnImage = By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div/div/div[1]/div/ul/li/a/img");

    By txtName = By.xpath("//input[contains(@id='ship_pay_fname')]");
    By txtMob = By.xpath("//input[contains(@id,'ship_pay_mobile')]");
    By txtEmail = By.xpath("//input[contains(@id,'ship_pay_email')]");
    By txtFlat = By.xpath("//input[contains(@id,'ship_pay_flat')]");
    By txtBldg = By.xpath("//input[contains(@id,'sship_pay_building')]");
    By txtStreet = By.xpath("//input[contains(@id,'sship_pay_street')]");
    By txtLocality = By.xpath("//input[contains(@id,'ship_pay_locality')]");
    By txtLandmark = By.xpath("//input[contains(@id,'ship_pay_landmark')]");
    By txtPincode = By.xpath("//input[contains(@id,'ship_pay_pincode')]");

    public OrderBook(WebDriver driverParam) {

        this.driver = driverParam;
    }

    public void bookOrder() throws InterruptedException {

        WebElement we = driver.findElement(LinkProduct);
        WebElement wb = driver.findElement(LinkRefillStarter);
        Actions a = new Actions(driver);
        a.moveToElement(we).perform();
        Thread.sleep(5000);
        a.moveToElement(wb).click().perform();
        Thread.sleep(8000);

        driver.findElement(btnAddToCart).click();
        Thread.sleep(5000);

        driver.findElement(LinkCart).click();
        Thread.sleep(2000);

        driver.findElement(btnProceedToCheckout).click();
        Thread.sleep(2000);

        driver.findElement(spanPointer).click();
        Thread.sleep(2000);

        driver.findElement(btnImage).click();
        Thread.sleep(2000);


    }
}
