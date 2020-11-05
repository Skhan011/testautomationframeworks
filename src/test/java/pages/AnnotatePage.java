package pages;

import org.openqa.selenium.By;
import utility.UIActions;

public class AnnotatePage extends UIActions {
    // Elements that user will interact
    private final By annoate_page_banner = css(".counter > div");


    // Actions that user carries out
    public boolean pageIsDisplayed() {
        return elementIsVisible(annoate_page_banner);
    }
}
