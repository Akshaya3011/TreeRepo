package Tests;

import org.testng.annotations.Test;

import Base.Base;

public class TC1 extends Base{
	@Test
	public void getTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
		
	}
	@Test
	public void getURL() {
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	@Test
	public void getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

}
