package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.DriverUtil;
import utility.UIActions;

public class UiActionsTest {

    @BeforeMethod
    public void setUp() {
        DriverUtil.open();
    }


    @AfterMethod
    public void cleanUp() {
        DriverUtil.quit();
    }


    @Test
    public void goinToWebsiteTest() {
        UIActions i = new UIActions();
        WebDriver driver = DriverUtil.getDriver();

        driver.get("https://www.google.com");
        i.waitFor(2);

        By search_box = By.name("q");
        i.write(search_box, "Stock price");

        i.waitFor(10);

    }


    @Test
    public void waitTillInvisibleTest() {
        UIActions i = new UIActions();

        i.gotoSite("http://webdriveruniversity.com/Ajax-Loader/index.html");
        i.waitUntilElementIsInvisible(By.cssSelector("div#loader"));
        DriverUtil.getDriver().findElement(By.cssSelector("span#button1 > p")).click();
        i.waitFor(10);
    }


    @Test
    public void doublClickTest() {
        UIActions i = new UIActions();

        i.gotoSite("https://demoqa.com/buttons");

        i.waitFor(3);

        By button = By.cssSelector("button#doubleClickBtn");
        i.doubleClick(button);

        i.waitFor(5);
    }


    @Test
    public void moveToViewTest() {
        UIActions i = new UIActions();
        WebDriver driver = DriverUtil.getDriver();
        i.gotoSite("https://trello.com");
        i.maximize();

        //driver.findElements(By.cssSelector("h2 > a"));
        i.moveElementToDisplay(By.cssSelector("#features h3"));

        i.waitFor(20);
    }

    @Test
    public void demo() {
        UIActions i = new UIActions();

        WebDriver driver = DriverUtil.getDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        WebElement dropdown = driver.findElement(By.cssSelector("div#state  .css-1hwfws3"));
        dropdown.click();
        i.waitFor(10);
        WebElement city = driver.findElement(By.xpath("//*[text()='Haryana']"));
        city.click();
        i.waitFor(6);

    }

    @Test
    public void testSelectAbstractedMethods() {
        UIActions i = new UIActions();
        i.gotoSite("https://ailab.acr.org");
        i.maximize();
        i.waitFor(2);
        By enter_button = By.xpath("//div[@id='div_slideshow']//button");
        i.click(enter_button);
        i.waitFor(2);

        By evaluate_tab = By.xpath("//a/span[text()='Evaluate']");
        i.click(evaluate_tab);
        i.waitFor(2);

        By select_location = By.id("useCases");
        i.click(select_location);
        i.waitFor(2);
        i.selectOptionsWithValue(select_location, "2");
        i.waitFor(10);
    }


}





















