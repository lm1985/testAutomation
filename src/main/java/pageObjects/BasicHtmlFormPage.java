package pageObjects;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicHtmlFormPage {

    public WebDriver driver;
    By username = By.cssSelector("input[name='username']");
    By password = By.cssSelector("input[name='password']");
    By commentsbox = By.cssSelector("textarea[name='comments']");
    By submitbutton = By.name("submitbutton");

    public BasicHtmlFormPage(WebDriver driver){

        this.driver = driver;

    }

    public WebElement getUserName(){

        return driver.findElement(username);
    }

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public  WebElement getCommentsBox(){
        return  driver.findElement(commentsbox);
    }

    public WebElement getSubmitButton(){return driver.findElement(submitbutton);  }




}
