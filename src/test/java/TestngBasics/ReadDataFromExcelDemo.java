package TestngBasics;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcelDemo {

    @Test
    public void ReadDataFromExcel() throws IOException {


        File file = new File("src/main/resources/TestDataSheet.xlsx");

        FileInputStream fis = new FileInputStream(file);

       XSSFWorkbook wb = new XSSFWorkbook(fis);


        XSSFSheet sheetAt = wb.getSheetAt(0);
      /*  Row row = sheetAt.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);*/


        System.out.println(wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue());

        fis.close();



    }

}
