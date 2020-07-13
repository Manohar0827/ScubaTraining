package com.demoqa.Utilites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	/* Elements */

	public static void clickWebEle(String weblocatorpath) {

		WebElement webEle = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(weblocatorpath));
		webEle.click();
	}

	public static void actionClick(String actlocatorPath) {

		WebElement smovEle = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(actlocatorPath));

		Actions action = new Actions(BrowserInitialization.GetInstance().getdriver());
		action.moveToElement(smovEle).click().perform();

	}

	public static void textBox(String txtlocatorPath, String value) {

		WebElement element = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(txtlocatorPath));
		element.sendKeys(value);
	}

	public static void radioBtn(String radlocatorPath) {

		BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(radlocatorPath)).click();

	}
	
	public static void clickbtn(String btnlocatorPath) {

		BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(btnlocatorPath)).click();

	}

	public static void uploadBtn(String upldloacatorpath, String filePath) throws Throwable {

		WebElement upldele = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(upldloacatorpath));
		upldele.click();
		// Store the location of the file in clipboard
		StringSelection strSel = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);

		// Create an object for robot class
		Robot robot = new Robot();
		// Control key in the keyboard
		// Ctrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void scrollPage() {

		JavascriptExecutor js = (JavascriptExecutor) BrowserInitialization.GetInstance().getdriver();

		js.executeScript("window.scrollBy(0,1000)");
	}

	/* Browser Windows */

	public static void browserWindows() {
		Set<String> iButtons = BrowserInitialization.GetInstance().getdriver().getWindowHandles();
		Iterator<String> it = iButtons.iterator();
		String parentid = it.next();
		String childid = it.next();
		BrowserInitialization.GetInstance().getdriver().switchTo().window(childid);
		String titl = BrowserInitialization.GetInstance().getdriver().getTitle();
		System.out.println("switched to child window :" + titl);
		String tex = BrowserInitialization.GetInstance().getdriver().findElement(By.id("sampleHeading")).getText();
	}

	/* Alerts */

	public static void alertHandle(String alertType, String locatorValue, String value) {

		switch (alertType) {
		case "normalAlert":
			String aler = BrowserInitialization.GetInstance().getdriver().switchTo().alert().getText();
			System.out.println("The alert text is :" + aler);

			BrowserInitialization.GetInstance().getdriver().switchTo().alert().accept();

		case "alertAfter5secs":
			// alert after 5secs
			BrowserInitialization.GetInstance().getdriver().findElement(By.id(locatorValue)).click();
			BrowserInitialization.GetInstance().getdriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			String alert = BrowserInitialization.GetInstance().getdriver().switchTo().alert().getText();
			System.out.println("The alert test is: " + alert);
			BrowserInitialization.GetInstance().getdriver().switchTo().alert().accept();

		case "alertConfirm":
			// alert accept or dismiss
			BrowserInitialization.GetInstance().getdriver().findElement(By.id(locatorValue)).click();
			String alerts = BrowserInitialization.GetInstance().getdriver().switchTo().alert().getText();
			System.out.println(alerts);
			BrowserInitialization.GetInstance().getdriver().switchTo().alert().accept();

		case "alertWithText":
			// Alert with send keys
			BrowserInitialization.GetInstance().getdriver().findElement(By.id(locatorValue)).click();
			String alertss = BrowserInitialization.GetInstance().getdriver().switchTo().alert().getText();
			System.out.println(alertss);
			BrowserInitialization.GetInstance().getdriver().switchTo().alert().sendKeys(value);
			BrowserInitialization.GetInstance().getdriver().switchTo().alert().accept();
		}

	}

	public static void sliderHandle(String locatorType) {

		WebElement Slider = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(locatorType));
		Actions moveSlider = new Actions(BrowserInitialization.GetInstance().getdriver());
		Action action = moveSlider.dragAndDropBy(Slider, 0, 26).build();
		action.perform();

	}

	public static void selectableHandle(String locatotorType) {

		WebElement ele = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(locatotorType));
		ele.click();
		if (ele.getAttribute("class").contains("active")) {
			// return ele;
			System.out.println("element selected");
		} else {
			System.out.println("failed");
		}

	}
	
	/* Date Picker */
	
	public static void selectByDate(String selctPath, String visible) throws Throwable {
		
		WebElement selctele = BrowserInitialization.GetInstance().getdriver().findElement(By.cssSelector(selctPath));
        Select obj = new Select(selctele);        
        Thread.sleep(1000);
        obj.selectByValue(visible);
              
    }

	public static void clickDatepicker() throws InterruptedException {
		WebElement date = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath("//div[@class='react-datepicker__input-container']/input[@type='text']"));
        date.click();
        Thread.sleep(1000);
	}
	
	public static void clickDay(String dayPath) {
		List<WebElement> listofdates = BrowserInitialization.GetInstance().getdriver().findElements(By.xpath(dayPath));
		int date = listofdates.size();
		System.out.println(date);
		for (int i = 0; i < date; i++) {

			String actual = listofdates.get(i).getText();
			if (actual.equals("23")) {
				listofdates.get(i).click();
			}

		}
	}
	
	/*Auto suggest text box */
	
	public static void autoSelectTxtBox(String autoSelctPath,String value){
		
		WebElement selctele = BrowserInitialization.GetInstance().getdriver().findElement(By.xpath(autoSelctPath));
		selctele.sendKeys(value);
		selctele.sendKeys(Keys.TAB);
	}
	
	public static String getCurrUrl() {
		
		String url = BrowserInitialization.GetInstance().getdriver().getCurrentUrl();
		//System.out.println(url);
		return url;
	}

}
