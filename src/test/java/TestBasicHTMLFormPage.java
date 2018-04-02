import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasicAjaxPage;
import pageObjects.BasicHtmlFormPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestBasicHTMLFormPage extends PropertyCheckAndSet{

    public WebDriverWait wait;


    @BeforeClass
    public static void initialise() throws IOException {

        driver = initialiseDriver();

    }

    @Test
    public void basicHTMLPageLoading(){

        driver.get(property.getProperty("url2"));
        String title = driver.getTitle();
        assertThat(title,is("HTML Form Elements"));

    }


    @Test
    public void testUNamePwdSubmit(){

        BasicHtmlFormPage bhfp = new BasicHtmlFormPage( driver);

        bhfp.getUserName().sendKeys("abc");
        bhfp.getPassword().sendKeys("123");
        bhfp.getSubmitButton().click();
        String newTitle = driver.getTitle();
        assertThat(newTitle,is("Processed Form Details"));

    }

    @AfterClass
    public static void closeWebPage(){

        driver.close();
        driver=null;
    }

}
