import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasicAjaxPage;

public class TestBasicAjaxPage extends PropertyCheckAndSet{

    public WebDriverWait wait;


    @BeforeClass
    public static void initialise() throws IOException {

        driver = initialiseDriver();

    }

    @Test
    public void basicAjaxPageLoading(){

        driver.get(property.getProperty("url"));
        String title = driver.getTitle();
        assertThat(title,is("Basic Ajax"));

    }

    @Test
    public void basicAjaxPage(){

        driver.get(property.getProperty("url"));
        String title = driver.getTitle();
        assertThat(title,is("Basic Ajax"));

    }

    @Test
    public void testCatgLangClkCodeInItButt(){

        BasicAjaxPage bap = new BasicAjaxPage( driver);

        Select categoryValue = new Select(bap.getCategory()) ;
        Select languageValue = new Select(bap.getLanguage());
        categoryValue.selectByVisibleText("Server");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        languageValue.selectByVisibleText("Java");
        bap.getCodeInItButton();

    }

    @AfterClass
    public static void closeWebPage(){

        driver.close();
        driver=null;
    }

}
