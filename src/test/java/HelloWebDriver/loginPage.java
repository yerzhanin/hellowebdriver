package HelloWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage extends HelloWebDriver {

    @Test
    public void loginTestCase() {
        driver.get("http://qa.qpf.epam.com");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"logo-and-form\"]")));
        WebElement userFld = driver.findElement(By.xpath(USERNAME));
        userFld.sendKeys("yerzhan_intykbayev");
        WebElement passFld = driver.findElement(By.xpath(PASSWORD));
        passFld.sendKeys("1");
        driver.findElement(By.xpath(LOGIN_BUTTON)).click();
        String Expected = driver.findElement(By.xpath(USER_PAGE)).getText();
        Assert.assertEquals(Expected, "SUMMARIZE AND COMMUNICATE1");
    }
}
