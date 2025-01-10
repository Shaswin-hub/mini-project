package org.mvn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
         public class BaseClass {
        	 
  public static WebDriver driver;
  public static Actions a;
  public static Select s;
  public static Robot r;
  
        public static void browserLaunch() {
           driver =new EdgeDriver();

}
        public static void launchUrl(String url) {
        	 driver.get(url);
		}
        public static void maxWin() {
        	driver.manage().window().maximize();

		}
        
        public static String printTitle() {
			 String title = driver.getTitle();
            return title;
		}
       public static String printUrl() {
			String currentUrl = driver.getCurrentUrl();
            return currentUrl;
		}
        public static void browserClose() {
			driver.quit();
		}
        public static void passData(WebElement webRef,String sendData) {
			webRef.sendKeys(sendData); 
		}
        public static void buttonClick(WebElement btnRef) {
			btnRef.click();
        }
        public static void dragDrop(WebElement dragRef,WebElement dropRef) {
        	  a=new Actions(driver);
             a.dragAndDrop(dragRef, dropRef).perform();;
		}
        public static void moveToElement(WebElement moveRef) {
			a.moveToElement(moveRef).perform();;
		}
        public static void refreshPage() {
			driver.navigate().refresh();

		}
        public static void snap() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
			File temFile = ts.getScreenshotAs(OutputType.FILE);
			File perFile=new File("C:\\Users\\CALWIN\\eclipse-workspace\\MavenCon\\target\\fb.png");
			FileUtils.copyFile(temFile, perFile);
        }
		public static void select(WebElement webref,  String sendkey) {
			 s=new Select(webref);
          s.selectByValue(sendkey);
          s.selectByValue(sendkey);
		}
       public static void roo() throws AWTException {
			 r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
            r.keyPress(KeyEvent.VK_TAB);
		}
       
       public static String dataDrivenRead(String workBookName,String shName,int rowNum,int cellNum) throws IOException {
    		
    		File f=new File("C:\\Users\\CALWIN\\eclipse-workspace\\MavenCon\\Ex\\"+workBookName+".xlsx");
    		
    		FileInputStream fin=new FileInputStream(f);
    		
    		Workbook book=new XSSFWorkbook(fin);
    		
    		Sheet sheet = book.getSheet("shName");
    		
    			Row row = sheet.getRow(rowNum);
    
    			Cell c = row.getCell(cellNum);
    			
    			String value="";
    			
    			int type = c.getCellType();
    			if (type==1) {
    				 value = c.getStringCellValue();
    			//	System.out.println(value);
    			}
    			else if (DateUtil.isCellDateFormatted(c)) {
    				Date dat = c.getDateCellValue();
    				SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
    				 value = sim.format(dat);
    			//	System.out.println(value);
    			}
    			else {
    				double dol = c.getNumericCellValue();
    				long l=(long)dol;
    				
    				
    				 value = String.valueOf(1);
    		//		System.out.println(value);
    				
    				
    			}
    			
    		return value;	
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    	}

         
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
         
     
    	   			
    	   		
       
    	   	
    	   	
    	   
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        
        
        
             

