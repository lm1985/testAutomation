package pageObjects;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicAjaxPage {

    public WebDriver driver;
    By category = By.cssSelector("select#combo1");
    By Language = By.cssSelector("select#combo2");
    By CodeInItButton = By.name("submitbutton");

    public BasicAjaxPage (WebDriver driver){

        this.driver = driver;

    }

    public WebElement getCategory(){

        return driver.findElement(category);
    }

    public WebElement getLanguage(){
        return driver.findElement(Language);
    }

    public  WebElement getCodeInItButton(){
        return  driver.findElement(CodeInItButton);
    }




}
