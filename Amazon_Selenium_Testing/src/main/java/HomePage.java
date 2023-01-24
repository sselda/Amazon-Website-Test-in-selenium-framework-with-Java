import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage{

    SearchBox searchBox;
    By cartCountLocator = new By.ByCssSelector("span#nav-cart-count");
    By cartContainerLocator = By.id("nav-cart-count-container");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
//        //Cookie Delete
//        driver.manage().deleteAllCookies();

////Chrome Incognito Mode
//        ChromeOptions options = new ChromeOptions();
//        options.AddArguments("--incognito");
//        IWebDriver driver = new ChromeDriver("C://",options);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount()>0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
       String count = find(cartCountLocator).getText();
       return Integer.parseInt(count);
    }
}
