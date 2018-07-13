import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author rsingh
 *
 */
public class TestOne extends BaseTest {
	WiniumDriver driver;

	public TestOne() {
		this.executor = new DriverExecutor();
		this.executor.driver = new WiniumDriver(service, options);
		this.driver = this.executor.driver;
	}

	@Test
	public void openNotepad() {
		System.out.println(driver.findElement(By.className("Notepad2U")).getAttribute("Name"));
	}
}