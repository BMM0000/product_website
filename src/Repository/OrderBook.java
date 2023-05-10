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


    //Hemangi Kadam WebElements
    By txtName = By.xpath("//input[contains(@id,'ship_pay_fname')]");
    By txtMob = By.xpath("//input[contains(@id,'ship_pay_mobile')]");
    By txtEmail = By.xpath("//input[contains(@id,'ship_pay_email')]");
    By txtFlat = By.xpath("//input[contains(@id,'ship_pay_flat')]");
    By txtBldg = By.xpath("//input[contains(@id,'ship_pay_building')]");
    By txtStreet = By.xpath("//input[contains(@id,'ship_pay_street')]");
    By txtLocality = By.xpath("//input[contains(@id,'ship_pay_locality')]");
    By txtLandmark = By.xpath("//input[contains(@id,'ship_pay_landmark')]");
    By txtPincode = By.xpath("//input[contains(@id,'ship_pay_pincode')]");
    By btnAddAddres=By.id("btnSaveAddress");

    //Swetha Kamath WebElements
    By checkBox=By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div/div/div[2]/label/span");
    By txtname2=By.id("pay_fname");
    By txtMob2=By.id("pay_mobile");
    By txtEmail2=By.id("pay_email");
    By txtFlat2=By.id("pay_flat");
    By txtBldg2=By.id("pay_building");
    By txtStreet2=By.id("pay_street");
    By txtLocality2=By.id("pay_locality");
    By txtLandmark2=By.id("pay_landmark");
    By txtCity2=By.id("pay_city");
    By txtPincode2=By.id("pay_pincode");



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


        //Script By Hemangi Kadam as on 09-05-2023
        driver.findElement(btnImage).click();
        Thread.sleep(2000);

        driver.findElement(txtName).sendKeys("Hemangi Kadam");
        Thread.sleep(2000);

        driver.findElement(txtMob).sendKeys("9833425754");
        Thread.sleep(1000);

        driver.findElement(txtEmail).sendKeys("Hemngi.kadam@hicare.in");
        Thread.sleep(1000);
        driver.findElement(txtFlat).sendKeys("121");
        Thread.sleep(1000);
        driver.findElement(txtBldg).sendKeys("Building Test");
        Thread.sleep(1000);
        driver.findElement(txtStreet).sendKeys("Test Street");
        Thread.sleep(1000);
        driver.findElement(txtLocality).sendKeys("Vikhroli");
        Thread.sleep(1000);
        driver.findElement(txtLandmark).sendKeys("Landmark test");
        Thread.sleep(1000);
        driver.findElement(btnAddAddres).click();

        //Script By Swetha Kamath as on 09-05-2023
        driver.findElement(checkBox).click();
        Thread.sleep(1000);

        driver.findElement(txtname2).sendKeys("Swetha Test");
        Thread.sleep(1000);

        driver.findElement(txtMob2).sendKeys("8433544769");
        Thread.sleep(1000);

        driver.findElement(txtEmail2).sendKeys("swetha.kamath@hicare.in");
        Thread.sleep(1000);

        driver.findElement(txtFlat2).sendKeys("Dubai Flat");
        Thread.sleep(1000);

        driver.findElement(txtBldg2).sendKeys("Dubai Bldg");
        Thread.sleep(1000);

        driver.findElement(txtStreet2).sendKeys("Dubai Street");
        Thread.sleep(1000);

        driver.findElement(txtLocality2).sendKeys("Dubai Loc");
        Thread.sleep(1000);

        driver.findElement(txtLandmark2).sendKeys("Dubai Landmark");
        Thread.sleep(1000);

        driver.findElement(txtCity2).sendKeys("Dubai City");
        Thread.sleep(1000);

        driver.findElement(txtPincode2).sendKeys("400010");
        Thread.sleep(1000);

    }
}
