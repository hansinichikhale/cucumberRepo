package com.frmwrk.util;



import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtility {

    public HashMap<String, String> readExcel(String filePath,String fileName,String sheetName) throws IOException{

    //Create an object of File class to open xlsx file
    int ExecutionFalg = 0;
    File file =    new File(filePath+"\\"+fileName);
    HashMap<String,String> hmap=new HashMap<String,String>();  
    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook TestWorkbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    TestWorkbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of XSSFWorkbook class

        TestWorkbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet TestSheet = TestWorkbook.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = TestSheet.getLastRowNum()-TestSheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {
    	
        Row row = TestSheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console
        String ColValue= row.getCell(j).getStringCellValue();
        if (ColValue.equalsIgnoreCase("Execution")) {
        	ExecutionFalg=j;
        }
        if (row.getCell(ExecutionFalg).getStringCellValue().equalsIgnoreCase("Y")) {
        	//System.out.print(row.getCell(j).getStringCellValue()+"|| ");
        	hmap.put(row.getCell(0).getStringCellValue(), row.getCell(2).getStringCellValue());
            
            /* Display content using Iterator*/
            
            }
        }
            

        }
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
       Map.Entry mentry = (Map.Entry)iterator.next();
       System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
       System.out.println(mentry.getValue());

            }
	return hmap; 


    }  

    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

    ExcelUtility objExcelFile = new ExcelUtility();

    //Prepare the path of excel file

    String filePath ="G:\\TestData" ;//System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

    //Call read file method of the class to read data

    objExcelFile.readExcel(filePath,"ExecutionData.xlsx","Sheet1");

    }

}