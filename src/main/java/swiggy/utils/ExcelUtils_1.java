package swiggy.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtils_1 {

    public static XSSFWorkbook openWorkbook(String excelFilePath) throws Throwable{
        File excelFile = new File(excelFilePath);
        FileInputStream excelFileStream = new FileInputStream(excelFile);
        return new XSSFWorkbook(excelFileStream);
    }

    public static void main(String[] args) throws Throwable{

            String excelFilePath="/Users/sudipa/Downloads/swiggyTestData.xlsx";

            XSSFWorkbook workbook = openWorkbook(excelFilePath);

            int numberOfSheets =workbook.getNumberOfSheets();
            System.out.println("Total sheets="+ numberOfSheets);


            //getting the sheet
            XSSFSheet sheet = workbook.getSheetAt(0);
            int lastRowNum= sheet.getLastRowNum();   //index
            System.out.println("Total Rows in sheet 1="+lastRowNum);


            //getting the last row
            XSSFRow row =sheet.getRow(lastRowNum);
            int lastCellNum= row.getLastCellNum();
            System.out.println("Last cell num="+lastCellNum);


//            //getting the 2nd index cell
//            XSSFCell cell =row.getCell(2);
//            String value =cell.getStringCellValue();
//            System.out.println("cell value at index 2="+value);



    }


}
