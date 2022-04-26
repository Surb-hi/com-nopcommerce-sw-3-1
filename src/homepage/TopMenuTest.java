package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openbrowser(baseUrl);
    }

    public void selectMenu(String menu) {
        System.out.println("//ul[@class='top-menu notmobile']//a[contains(text(),'" + menu + "')]");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'" + menu + "')]"));
    }

    @Test
    public void verifyPageNavigation() {
        List<String> topmenu = new ArrayList<>();
        topmenu.add("Computers");
        topmenu.add("Electronics");
        topmenu.add("Apparel");
        topmenu.add("Digital downloads");
        topmenu.add("Books");
        topmenu.add("Jewelry");
        topmenu.add("Gift Cards");

        for (int i = 0; i < topmenu.size(); i++) {
            selectMenu(topmenu.get(i));
            String actualmessge = getTextFromElement(By.xpath("//h1[contains(text(),'" + topmenu.get(i) + "')]"));
            Assert.assertEquals("", topmenu.get(i), actualmessge);
        }
    }

    @After
    public void tearDown() {
        closebrowser();
    }
}
