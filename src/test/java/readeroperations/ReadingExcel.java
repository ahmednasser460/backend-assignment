package readeroperations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {

    public String getDataFromExcel(int rowNumber, int cellNumber) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("./data/TestData.xlsx");

        // Create a workbook object from the input stream
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Get the sheet at index 0
        Sheet sheet = workbook.getSheetAt(0);

        // Get the row at specific index
        Row row = sheet.getRow(rowNumber);

        // Get the cell at specific column
        Cell cell = row.getCell(cellNumber);

        String value = cell.getStringCellValue();

        // Close the input stream
        fileInputStream.close();
        return value;
    }

}

