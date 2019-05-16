package HelloWebDriver;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class HelloWebDriver {
    public static final String USERNAME = "//*[@id=\"j_username\"]";
    public static final String PASSWORD = "//*[@id=\"j_password\"]";
    public static final String LOGIN_BUTTON = "//*[@id=\"loginbutton\"]";
    public static final String USER_PAGE = "//*[@id=\"campaign-bar-communicate\"]";

    public static WebDriver driver = new ChromeDriver();

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
