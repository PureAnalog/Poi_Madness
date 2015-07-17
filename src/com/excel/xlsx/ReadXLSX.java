package com.excel.xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 



import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLSX {
	
	XSSFWorkbook workbook;
	
	XSSFSheet sheet;
	
	XSSFRow row;

	public ReadXLSX(File file){
		
		FileInputStream fis=null;
		
		try{
			
			 fis = new FileInputStream(file);	
			 
			 workbook = new XSSFWorkbook(fis);
			
		} catch (IOException e) {
			
			System.out.println("file not found");
			
		}finally{
			
			try{
				
				if(fis !=null)
			       fis.close();	
			}catch(IOException e){
				e.printStackTrace();
			}
		}	
	}
	
	public void setSheet(String sheetName){
		
		sheet = workbook.getSheet(sheetName);
	}
	
	public void setSheet(int ind){
		sheet = workbook.getSheetAt(ind);
	}
	
	public void readRows(){
		
	}
	
}
