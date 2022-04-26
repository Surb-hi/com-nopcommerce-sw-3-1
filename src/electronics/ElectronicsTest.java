package electronics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ElectronicsTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openbrowser(baseUrl);
    }
@Test
    public void textverified(){
        //Mouse Hover on “Electronics” Tab
        mousehover(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        //Mouse Hover on “Cell phones” and click
        mousehover(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        //Verify the text “Cell phones
        String expectedresult= "Cell phones";
        String actualresult= getTextFromElement(By.xpath("//h1[text()='Cell phones']"));
        Assert.assertEquals(actualresult, expectedresult);
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        textverified();
        //Click on List View Tab
        clickOnElement(By.xpath("//a[@title='List']"));
        //Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        clickOnElement(By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]"));
        //Verify the text “Nokia Lumia 1020”
        String expectedresult= "Nokia Lumia 1020";
        String actualresult= getTextFromElement(By.xpath("//h1[text()='Nokia Lumia 1020']"));
        Assert.assertEquals(actualresult, expectedresult);
        //Verify the price “$349.00”
        String expectedresult1= "$349.00";
        String actualresult1= getTextFromElement(By.xpath("//span[@id='price-value-20']"));
        Assert.assertEquals(actualresult1, expectedresult1);
        //Change quantity to 2
        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"),"2");
        //Click on “ADD TO CART” tab
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedresult2= "The product has been added to your shopping cart";
        String actualresult2= getTextFromElement(By.xpath("//p[@class='content']"));
        Assert.assertEquals(actualresult2, expectedresult2);
        //close the bar clicking on the cross button
        clickOnElement(By.xpath("//span[@title='Close']"));
        //MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mousehover(By.xpath("//span[text()='Shopping cart']"));
        clickOnElement(By.xpath("//button[@class='button-1 cart-button']"));
        //Verify the message "Shopping cart"
        String expectedresult3= "Shopping cart";
        String actualresult3= getTextFromElement(By.xpath("//h1[text()='Shopping cart']"));
        Assert.assertEquals(actualresult3, expectedresult3);
        //Verify the quantity is 2
        String expectedresult4= "";
        String actualresult4= getTextFromElement(By.xpath("//input[@class='qty-input']"));
        Assert.assertEquals(expectedresult4,actualresult4);
        //Verify the Total $698.00
        String expectedresult5= "$698.00";
        String actualresult5= getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
        Assert.assertEquals(actualresult5, expectedresult5);
        //click on checkbox “I agree with the terms of service
        clickOnElement(By.xpath("//input[@name='termsofservice']"));
        //Click on checkout
        clickOnElement(By.xpath("//button[@value='checkout']"));
        //Verify the Text “Welcome, Please Sign In!”
        String expectedresult6= "Welcome, Please Sign In!";
        String actualresult6= getTextFromElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        Assert.assertEquals(actualresult6, expectedresult6);
        //Click on “REGISTER” tab
        clickOnElement(By.xpath("//button[contains(text(),'Register')]"));
        //Verify the text “Register
        String expectedresult7= "Register";
        String actualresult7= getTextFromElement(By.xpath("//h1[text()='Register']"));
        Assert.assertEquals(actualresult7, expectedresult7);
        //Fill the mandatory fields
        clickOnElement(By.xpath("//label[text()='Female']"));
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"surbhi");
        sendTextToElement(By.xpath("//input[@id='LastName']"), "patel");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='DateOfBirthDay']"),"1");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='DateOfBirthMonth']"),"March");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='DateOfBirthYear']"),"2022");
        sendTextToElement(By.xpath("//input[@id='Email']"), "prime1999@gmail.com");
        sendTextToElement(By.xpath("//input[@name='Password']"),"prime123");
        sendTextToElement(By.xpath("//input[@name='ConfirmPassword']"),"prime123");
        //Click on “REGISTER” Button
        clickOnElement(By.xpath("//button[@name='register-button']"));
        //Verify the message “Your registration completed”
        String expectedresult8= "Your registration completed";
        String actualresult8= getTextFromElement(By.xpath("//div[text()='Your registration completed']"));
        Assert.assertEquals(actualresult8, expectedresult8);
        //Click on “CONTINUE” tab
        clickOnElement(By.xpath("//a[text()='Continue']"));
        //Verify the text “Shopping cart”
        String expectedresult9= "Shopping cart";
        String actualresult9= getTextFromElement(By.xpath("//h1[text()='Shopping cart']"));
        Assert.assertEquals(actualresult9, expectedresult9);
        //click on checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //Click on “CHECKOUT
        clickOnElement(By.xpath("//button[@name='checkout']"));
        //Fill the Mandatory fields
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.FirstName']"), "surbhi");
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.LastName']"), "patel");
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.Email']"));
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.Email']"), "prime1234@gmail.com");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='BillingNewAddress.CountryId']"), "United Kingdom");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"),"leicter");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='BillingNewAddress.StateProvinceId']"), "Other");
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.Address1'] "), "35 lee street");
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']"), "380032");
        sendTextToElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']"), "1234567891");
        //Click on “CONTINUE
        clickOnElement(By.xpath("//button[@onclick='Billing.save()']"));
        //Click on Radio Button “2nd Day Air ($0.00)”
        clickOnElement(By.xpath("//input[@id='shippingoption_2']"));
        //Click on “CONTINUE
        clickOnElement(By.xpath("//button[@onclick='ShippingMethod.save()']"));
        //Select Radio Button “Credit Card”
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        //Select continue
        clickOnElement(By.xpath("//button[@onclick='PaymentMethod.save()']"));
        //Select “Visa” From Select credit card dropdown
        Thread.sleep(1000);//
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"),"Visa");
        //Fill all the details
        sendTextToElement(By.xpath("//input[@name='CardholderName']"), "surbhi");
        sendTextToElement(By.xpath("//input[@name='CardNumber']"), "4111111111111111");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='ExpireMonth']"), "01");
        selectByVisibleTextFromDropDown(By.xpath("//select[@name='ExpireYear']"), "2028");
        sendTextToElement(By.xpath("//input[@name='CardCode']"), "234");

        //Click on “CONTINUE”CHECKOUT”
        clickOnElement(By.xpath("//button[@onclick='PaymentInfo.save()']"));
        //Verify “Payment Method” is “Credit Card”
        String expectedresult10= "Credit Card";
        String actualresult10= getTextFromElement(By.xpath("//span[contains(text(),'Credit Card')]"));
        Assert.assertEquals(actualresult10, expectedresult10);
        //Verify “Shipping Method” is “2nd Day Air”
        String expectedresult11= "2nd Day Air";
        String actualresult11= getTextFromElement(By.xpath(" //ul[@class=\"info-list\"]//span[contains(text(),'2nd Day Air')]"));
        Assert.assertEquals(actualresult11, expectedresult11);
        //Verify Total is “$698.00
        String expectedresult12= "$698.00";
        String actualresult12= getTextFromElement(By.xpath("// span[@class='value-summary']//strong[text()='$698.00']"));
        Assert.assertEquals(actualresult12, expectedresult12);
        //Click on “CONFIRM”
        Thread.sleep(1000);
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
        //Verify the Text “Thank You”
        String expectedresult13= "Thank you";
        String actualresult13= getTextFromElement(By.xpath("//h1[text()='Thank you']"));
        Assert.assertEquals(actualresult13, expectedresult13);
        //Verify the message “Your order has been successfully processed!”
        String expectedresult14= "Your order has been successfully processed!";
        String actualresult14= getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        Assert.assertEquals(actualresult14, expectedresult14);
        //Click on “CONTINUE
        clickOnElement(By.xpath("//button[@onclick='setLocation(\"/\")']"));
        //Verify the text “Welcome to our store
        String expectedresult15= "Welcome to our store";
        String actualresult15= getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        Assert.assertEquals(actualresult15, expectedresult15);
        //Click on “Logout” link
        clickOnElement(By.xpath("//a[@class='ico-logout']"));
        //Verify the URL is “https://demo.nopcommerce.com/”
        String expectedresult17= "https://demo.nopcommerce.com/";
        String actualresult17=driver.getCurrentUrl();
        Assert.assertEquals(actualresult15, expectedresult15);

    }

    @After
    public void tearDown() {
        //closebrowser();
    }
}
