import java.io.File;

import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriverService;
import org.openqa.selenium.winium.WiniumDriverService.Builder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * 
 */

/**
 * @author rsingh
 *
 */
public class BaseTest {
	protected DriverExecutor executor;
	protected static WiniumDriverService service;
	protected static String driverPath;
	protected static DesktopOptions options = new DesktopOptions();

	public BaseTest() {
		WindowsUtils.killByName("Winium.Desktop.Driver.exe");
		driverPath = "W:\\Users\\rsingh\\eclipse-workspace\\WiniumJava\\vendor\\driver\\Winium.Desktop.Driver.exe";
		System.setProperty("webdriver.winium.driver.desktop", driverPath);
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		service = new Builder().usingDriverExecutable(new File(driverPath)).usingPort(8080).withVerbose(true)
				.withSilent(false).buildDesktopService();
	}

	@BeforeSuite
	public void setUp() {
		WindowsUtils.killByName("Winium.Desktop.Driver.exe");
	}

	@AfterClass
	public void tearDown() {

	}

	@AfterSuite
	public void reportGenerator() {

	}
}
