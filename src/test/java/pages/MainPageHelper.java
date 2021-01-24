package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHelper extends PageBase{

    public MainPageHelper(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "slogan")
    WebElement slogan;
    @FindBy(css = ".mat-button-wrapper .material-icons")
    WebElement homeButton;
    @FindBy(id="mat-input-0")
    WebElement fromField;
    @FindBy(id = "mat-input-1")
    WebElement toField;
    @FindBy(css = "button[type=submit]")
    WebElement buttonLetsGo;
    @FindBy(className = "aside")
    WebElement searchResults;
    @FindBy(xpath = "//SPAN[@class='mat-option-text'][text()=' Tel-Aviv ']")
    WebElement fromResult;
    @FindBy(xpath = "//SPAN[@class='mat-option-text'][text()=' London ']")
    WebElement toResult;
    @FindBy(tagName = "iframe")
    WebElement feedbackForm;
    @FindBy(xpath = "//SPAN[@class='mat-button-wrapper'][text()='Clear form']")
    WebElement buttonClearForm;




    public boolean sloganContainsText() {
        return slogan.getText().contains("CHEAP TRIP. PAY LESS, VISIT MORE!");
    }


    public boolean homeButtonIsDisplayed() {
        return homeButton.isDisplayed();
    }
    public void inputCityInFromField(String city) {
        fromField.sendKeys(city);
    }
    public void clickOnFromSearchResult() {
        fromResult.click();
    }
    public void inputCityInToField(String city) {
        toField.sendKeys(city);
    }
    public void clickOnToSearchResult() {
        toResult.click();
    }
    public void clickOnLetsGoButton() {
        buttonLetsGo.click();
    }
    public boolean resultIsDisplayed() {
        return searchResults.isDisplayed();
    }


    public boolean feedBackFormIsDisplayed() throws InterruptedException {
        Thread.sleep(100);
        return feedbackForm.isDisplayed();
    }

    public void clickOnButtonClearForm() {
        buttonClearForm.click();
    }
}
