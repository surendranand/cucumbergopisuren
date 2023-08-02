package com.OmrBranchbaseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

public static	WebDriver driver;
	public static void browserlaunch() {
		driver=new ChromeDriver();
}
public static void enterurl(String url) {
	driver.get(url);
}
public static void maximizewindow() {
	driver.manage().window().maximize();
}
public static void sendkeys(WebElement element,String data) {
	element.sendKeys(data);
}
public static void click(WebElement element) {
	element.click();
	}
public static void clickenter(WebElement element,String data) {
	element.sendKeys(data,Keys.ENTER);
}
public static String getapptitle() {
	String title = driver.getTitle();
	return title;
}
public static WebElement findelementbyId(String attributevalue) {
	WebElement Element = driver.findElement(By.id(attributevalue));
	return Element;
}
public static WebElement findelementbyName(String attributename) {
WebElement Element = driver.findElement(By.name(attributename));
return Element;
}
public static WebElement findelementbyclassname(String attributename) {
	WebElement Element = driver.findElement(By.className(attributename));
	return Element;
}
public static WebElement findelementbyXpath(String attributevalue) {
	WebElement Element = driver.findElement(By.xpath(attributevalue));
	return Element;
}
public static void okAlert() {
	driver.switchTo().alert().accept();
	
}
public static void cancelalert() {
	driver.switchTo().alert().dismiss();
}
public static void closecurrentwindow() {
	driver.close();
}
public static void closeallwindow() {
	driver.quit();
}
public static String valuefromtextbox(WebElement element,String attributevalue) {
	String attribute = element.getAttribute(attributevalue);
	return attribute;
	}
public static String gettextfrompage(WebElement string) {
	String text = string.getText();
	return text;
}
public  static void selectoptionbytext(WebElement element,String data) {
	Select select =new Select(element);
	select.selectByVisibleText(data);
}
public static void selectoptionbyattribute(WebElement element,String data) {
	Select select =new Select(element);
	select.deselectByValue(data);	
}
public static void selectoptionbyindex(WebElement element,int index) {
	Select select=new Select(element);
	select.selectByIndex(index);
} 
public static void childwindow() {
	String parentwindow = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String eachwindoww : windowHandles) {
		if (!parentwindow.equals(eachwindoww)) {
			
			driver.switchTo().window(eachwindoww);
			
		}
		
	}
  
}
public static void frameDefaultContent() {
	driver.switchTo().defaultContent();
	waitimplicitly();
}

public static void switchtoframebyindex(int index) {
      driver.switchTo().frame(index);
}
public  static void switchtoframebyid(String id) {
	driver.switchTo().frame(id);
}
public  static void alldropdownastext(WebElement element) {
	Select dtext= new Select(element);
	List<WebElement> alloption = dtext.getOptions();
	for (WebElement text1 : alloption) {
	     String text2 = text1.getText();
	     
	     }
}
public static void firstselectedoption(WebElement element) {
	Select firsttext= new Select(element);
	 firsttext.getFirstSelectedOption();
}

public static boolean ismultiselect(WebElement element) {
	Select select=new Select(element);
	boolean multiple = select.isMultiple();
	return multiple;
}
public static boolean isdisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;	
}
public static boolean isenabled(WebElement element) {
	boolean enabled = element.isEnabled();
	return enabled;
}
public static boolean isselected(WebElement element) {
	boolean selected = element.isSelected();
	return selected;
}
public static void deselectbyindex(WebElement element,int index) {
	Select select=new Select(element);
	select.deselectByIndex(index);
}
public static void deselectbyvalue(WebElement element,String value) {
	Select select=new Select(element);
select.deselectByValue(value);	
}
public static void deselectbytext(WebElement element,String text) {
	Select select=new Select(element);
	select.deselectByVisibleText(text);	
}
public static void deselectbyall(WebElement element) {
	Select select=new Select(element);
	select.deselectAll();
}
public static void getparentwindow() {
	String windowHandle = driver.getWindowHandle();
}
public static void cleartext(WebElement element) {
	element.clear();
}
public static void takescreenshot(String newfile) throws IOException {
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File screenshotas=screenshot.getScreenshotAs(OutputType.FILE);
	File file= new File("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\MavenPractice\\Screenshot\\"+newfile+".png");
	FileUtils.copyFile(screenshotas,file);
}
public static void takescreenshotelement(WebElement element,String name1)throws IOException {
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File screenshotas=element.getScreenshotAs(OutputType.FILE);
	File file= new File("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\MavenPractice\\Screenshot\\"+name1+".png");
	FileUtils.copyFile(screenshotas,file);
}

public static void mouseover(WebElement element) {
	
	Actions action =new Actions(driver);
	action.moveToElement(element).perform();
}
public static void rightclick() {
	Actions action=new Actions(driver);
	action.contextClick().perform();
}
public static void doubleclick() {
	Actions action=new Actions(driver);
	action.doubleClick().perform();
}
public static void refresh() {
	driver.navigate().refresh();
}
public static void sendskeysbyjs(WebElement element,String data) {
	JavascriptExecutor executor =(JavascriptExecutor)driver;
executor.executeScript("arguments[0].setattribute('value''"+data+"')", element);
}
public static void clickbuttonbyjs(WebElement element) {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", element);
	
}

public static String readexceldata(String sheetname,int rownum,int cellnum) throws IOException {
String res=null;
File file = new File("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\MavenPractice\\Exceldoc\\excelpro.xlsx");
FileInputStream fileInputStream =new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(fileInputStream);
Sheet sheet = workbook.getSheet(sheetname);
Row row = sheet.getRow(rownum);
Cell cell = row.getCell(cellnum);
CellType type = cell.getCellType();
switch (type) {
case STRING:
	res=cell.getStringCellValue();
	break;
case NUMERIC:
	if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat datefomat =new SimpleDateFormat("dd-MMMM-yy");
	res = datefomat.format(dateCellValue);
	
	}
	else 
	{
		double numericCellValue = cell.getNumericCellValue();
		long check = Math.round(numericCellValue);
		if (numericCellValue==check) {
			res= String.valueOf(check);
			
		} else {
			res = String.valueOf(numericCellValue);
	}
	
	}
	break;
default:
	break;
}
return res;
}

public static void writecelldata(String sheetname,int rownum,int cellnum,String data) throws IOException 
{
	File file = new File("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\MavenPractice\\Exceldoc\\excelpro.xlsx");
	FileInputStream fileInputStream =new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	if(cell==null) {
		cell=row.createCell(cellnum);
	}
	cell.setCellValue(data);
	FileOutputStream fileoutputstream=new FileOutputStream(file);
	workbook.write(fileoutputstream);
}
public static void updatecelldata(String sheet,int rownum,int cellnum,String olddata,String newdata) throws IOException 
{
	File file = new File("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\MavenPractice\\Exceldoc\\excelpro.xlsx");
	FileInputStream fileInputStream =new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileInputStream);
	Sheet sheet1 = workbook.getSheet(sheet);
	Row row = sheet1.getRow(rownum);
	Cell cell = row.getCell(cellnum);
        String Value = cell.getStringCellValue();
        if (Value.equals(olddata)) {
        	cell.setCellValue(newdata);
			}
        FileOutputStream fileoutputstream=new FileOutputStream(file);
    	workbook.write(fileoutputstream);
    	

}
public static void robort() throws AWTException {
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
} 	
public  static String getprojectpath() {
String path = System.getProperty("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\OmrBranchHotelBookingAutomation"); 
return path;

}
public static String getpropertyfilevalue(String key) throws FileNotFoundException, IOException {
	Properties properties =new Properties();
properties.load(new FileInputStream("C:\\Users\\suren\\OneDrive\\Desktop\\eclipse prject\\OmrBranchHotelBookingAutomation\\Config\\Config.properties"));
Object object = properties.get(key);
String value=(String)object;
return value;
}
public void getdriver(String browsertype) {
	switch(browsertype)
	{
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;
	case "ie":
		driver=new InternetExplorerDriver();
		break;
	case "edge":
		driver=new EdgeDriver();
		break;
	default:
		break;

}
}
public static void SwitchtoparentWindow() {
 driver.switchTo().parentFrame();

}

public static void waitimplicitly() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

public static void sendEnterKey(WebElement e) {
	waitimplicitly();
	e.sendKeys(Keys.ENTER);

}


}
