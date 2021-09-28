package swiggy.utils;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtils_2 {

    public static XSSFWorkbook openWorkbook(String excelFilePath) throws Throwable{
        File excelFile = new File(excelFilePath);
        FileInputStream excelFileStream = new FileInputStream(excelFile);
        return new XSSFWorkbook(excelFileStream);
    }

    public static void printExcelFile(String excelFilePath,int sheetIndex) throws Throwable{

        XSSFWorkbook workbook = openWorkbook(excelFilePath);
        XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

        int lastRowIndex= sheet.getLastRowNum();  //last rown num is part of index

        //looping all rows
        for (int cuurRowIndex=0;cuurRowIndex<=lastRowIndex;cuurRowIndex++){
            XSSFRow row =sheet.getRow(cuurRowIndex);
            int lastCellNum= row.getLastCellNum();

            //looping into all cell values
            for( int currCellIndex=0;currCellIndex<lastCellNum;currCellIndex++){
                XSSFCell cell =row.getCell(currCellIndex);
                printExcelCellValue(cell);
                System.out.print("\t");
            }

            System.out.println("");

        }
    }

    private static void printExcelCellValue(XSSFCell cell) {
        switch (cell.getCellType()){
            case STRING:
                System.out.print(cell.getStringCellValue());
                break;
            case NUMERIC:
                System.out.print(cell.getNumericCellValue());
                break;
            default:
                System.out.println(cell.getStringCellValue());
        }
    }

    public static void main(String[] args) throws Throwable{

            String excelFilePath="/Users/sudipa/Downloads/swiggyTestData.xlsx";
            printExcelFile(excelFilePath,0);

    }


}
