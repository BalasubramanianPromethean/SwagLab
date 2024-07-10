/*
 * package SwagLabs.SwagLabs;
 * 
 * import java.io.ObjectInputFilter.Status; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Reporter; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.BeforeClass;
 * import org.testng.annotations.Test;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter;
 * 
 * 
 * 
 * 
 * public class ClassTwo { WebDriver driver;
 * 
 * ExtentReports extent; ExtentSparkReporter spark; ExtentTest test;
 * 
 * 
 * 
 * @BeforeClass public void launch_browser() {
 * 
 * driver = new ChromeDriver();
 * 
 * extent = new ExtentReports(); spark = new
 * ExtentSparkReporter("target/Spark.html"); extent.attachReporter(spark);
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * Reporter.log("the browser is openend sucessfully and navigated url", true);
 * driver.get("https://www.saucedemo.com/");
 * extent.createTest("this is demo").log(Status.INFO, "String");
 * extent.createTest("launch browser and website").assignAuthor("sanjay").
 * assignCategory("smoke test").assignDevice("chrome") .log(Status.PASS,
 * "This is a logging event for MyFirstTest, and it passed!");
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * @BeforeMethod public void login() {
 * 
 * }
 * 
 * 
 * @Test public void regression() throws InterruptedException {
 * Thread.sleep(3000);
 * Reporter.log(" sucessfully navigated to url and eneterd into login page ",
 * true);
 * 
 * extent.createTest("verify addtocart page").assignAuthor("giri").
 * assignCategory("sanity test").assignDevice("edge") .log(Status.INFO,
 * "sucessfully navigated to url and eneterd into login page ");
 * 
 * 
 * 
 * WebElement login=
 * driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[1]"));
 * login.getText(); System.out.println(login);
 * 
 * 
 * Actions act = new Actions(driver); WebElement element1 =
 * driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[2]"));
 * act.moveToElement(element1); act.keyDown(Keys.CONTROL).sendKeys("a", "c");
 * element1.getText(); System.out.println(element1);
 * 
 * 
 * 
 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
 * Thread.sleep(3000);
 * 
 * 
 * driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
 * driver.findElement(By.xpath(
 * "//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
 * driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
 * 
 * }
 * 
 * @Test(priority = 1) public void address_page_info() throws
 * InterruptedException { Reporter.
 * log(" sucessfully loged in sucessfully and entered into address_page_info()",
 * true);
 * 
 * extent.createTest("verify address page details").assignAuthor("vasanth").
 * assignCategory("regression test").assignDevice("fire fox") .log(Status.INFO,
 * "sucessfully loged in sucessfully and entered into address_page_info() ");
 * 
 * driver.findElement(By.xpath(
 * "//button[@id='remove-sauce-labs-backpack']/following::button[1]")).click();
 * driver.findElement(By.id("checkout")).click();
 * driver.findElement(By.id("first-name")).sendKeys("sanjay");
 * Thread.sleep(3000);
 * 
 * driver.findElement(By.id("last-name")).sendKeys("kumar");
 * driver.findElement(By.id("postal-code")).sendKeys("600091");
 * driver.findElement(By.id("continue")).click();
 * driver.findElement(By.id("finish")).click();
 * 
 * }
 * 
 * @Test(priority = 2) public void validation_thank_you_page() throws
 * InterruptedException { Reporter.
 * log(" sucessfully completed address_page_info()and entered into validation_thank_you_page() "
 * , true);
 * 
 * 
 * extent.createTest("verify validation of 6 get methods").assignAuthor("sanjay"
 * ).assignCategory("smoke test").assignDevice("chrome") .log(Status.INFO,
 * "sucessfully completed address_page_info()and entered into validation_thank_you_page()"
 * );
 * 
 * 
 * String PageTitle = driver.getTitle();// to print on consul screen output Swag
 * Labs System.out.println(PageTitle);
 * 
 * String CurrentPageUrl = driver.getCurrentUrl();
 * System.out.println(CurrentPageUrl);//
 * https://www.saucedemo.com/checkout-complete.html
 * 
 * String attribute = driver.findElement(By.
 * xpath("//h2[contains(text(),'Thank you for your order!')]"))
 * .getAttribute("class"); System.out.println(attribute); // complete-header
 * 
 * String tgname = driver.findElement(By.
 * xpath("//h2[contains(text(),'Thank you for your order!')]")).getTagName();
 * System.out.println(tgname);// h2 Thread.sleep(3000);
 * 
 * 
 * String CssValu =
 * driver.findElement(By.xpath("//img[@class='pony_express']")).getCssValue(
 * "font-size"); System.out.println(CssValu);// 14px
 * Reporter.log(" sucessfully completed validation_thank_you_page() ", true);
 * 
 * driver.findElement(By.id("react-burger-menu-btn")).click();
 * driver.findElement(By.id("logout_sidebar_link")).click();
 * 
 * 
 * Reporter.log("  loged out sucessfully and enterd into close_browser()page",
 * true);
 * 
 * extent.createTest("verify logout").assignAuthor("sanjay").
 * assignCategory("smoke test").assignDevice("chrome") .log(Status.INFO,
 * "  loged out sucessfully and enterd into close_browser()page");
 * 
 * 
 * 
 * }
 * 
 * @AfterClass public void close_browser() { driver.close();
 * Reporter.log("sucessfully close_browser()", true);
 * 
 * 
 * extent.createTest("verify whether browser is closed").assignAuthor("sanjay").
 * assignCategory("smoke test").assignDevice("chrome") .log(Status.INFO,
 * "sucessfully close_browser()");
 * 
 * extent.flush(); driver.quit();
 * 
 * }
 * 
 * }
 * 
 * 
 */