package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public void takescheenshot(WebDriver driver, String TCID) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\LENOVO\\git\\repository2\\FrameworkdMaven\\ScreenshotStore\\"+ TCID+".jpg");
		FileHandler.copy(src, dest);
		
		
	}

}
