import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {

    WebDriver driver;

    @BeforeAll
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=119366379979&hvpone=&hvptwo=&hvadid=542862704348&hvpos=&hvnetw=g&hvrand=3204526542162550158&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012782&hvtargid=kwd-10573980&hydadcr=12932_2246093&gclid=CjwKCAiA76-dBhByEiwAA0_s9c9ZATZckGzoe29UzgPuS0XRMF56Pl1UMDoq-jNSUHl_NavNS8fgShoCKOcQAvD_BwE&language=tr_TR");
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){driver.quit();}
}
