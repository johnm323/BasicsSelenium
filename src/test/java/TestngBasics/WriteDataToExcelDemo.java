package TestngBasics;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;

public class WriteDataToExcelDemo {

    @Test
    public void WriteToExcelDemo() throws IOException {

        File file = new File("src/main/resources/TestDataSheet.xlsx");
        FileOutputStream fos = new FileOutputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Sheet1");
       // sheet.createRow(0).createCell(0).setCellValue("Test Column 1");
        Row r0 = sheet.createRow(0);
        Cell c0 = r0.createCell(0);
        c0.setCellValue("Testing John");




        wb.write(fos);
        fos.close();

        System.out.println("File is written successfully");

    }


}
