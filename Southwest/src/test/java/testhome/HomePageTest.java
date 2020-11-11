package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    //This is an example use your own tests
    @Test(enabled = false)
    public void sample(){

    }
}