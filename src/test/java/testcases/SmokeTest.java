package testcases;

import commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AnnotatePage;
import pages.RunPage;
import pages.WelcomePage;
import utility.DriverUtil;
import utility.UIActions;

public class SmokeTest extends BaseTest {

    @Test
    public void verifyUserCanGoToWelcomePage() {
        WelcomePage welcome = new WelcomePage();
        welcome.openAilab();
        boolean result = welcome.pageIsDisplayed();
        Assert.assertTrue(result);
    }

    @Test
    public void verifyUserCanGoToAnnotatePageFromHomePage() {
        WelcomePage welcome = new WelcomePage();
            welcome.openAilab();
            welcome.clickAnnotateButton();
        AnnotatePage annotate = new AnnotatePage();
             boolean result = annotate.pageIsDisplayed();
        Assert.assertTrue(result);
    }

    @Test
    public void verifyRunPageIsReachableFromHome() {
        WelcomePage welcome = new WelcomePage();
            welcome.openAilab();
            welcome.clickRunButton();
        RunPage run = new RunPage();
        boolean result = run.pageIsDisplayed();
        Assert.assertTrue(result);
    }

    @Test
    public void verifyBDRunInferenceFails() {
        // Page objects
        WelcomePage welcomePage = new WelcomePage();
        RunPage runPage = new RunPage();

        // Test Scripts
        welcomePage.openAilab();
        welcomePage.clickRunButton();
        runPage.selectUseCase("Breast Density");
        runPage.clickRunPrediction();
        boolean result = runPage.failedTextDisplayed();
        result = false;
        Assert.assertTrue(result);
    }
    // Pneumonia

    @Test
    public void verifyPneumoniaRunInferenceFails() {

        // Page objects
        WelcomePage welcomePage = new WelcomePage();
        RunPage runPage = new RunPage();

        // Test Scripts
        welcomePage.openAilab();
        welcomePage.clickRunButton();
        runPage.selectUseCase("Pneumonia");
        runPage.clickRunPrediction();
        boolean result = runPage.failedTextDisplayed();

        Assert.assertTrue(result);
    }
}
