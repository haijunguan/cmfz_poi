package com.baizhi;

import com.baizhi.entity.Student;
import org.apache.poi.hssf.usermodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class textOut {
    @Test
    public void testOut1() throws IOException {

        List<Student> list = new ArrayList<>();
        Student xiaoming1 = new Student(001, "xiaoming1", "111111", new Date());
        Student xiaoming2 = new Student(002, "xiaoming2", "111111", new Date());
        Student xiaoming3 = new Student(003, "xiaoming3", "111111", new Date());
        list.add(xiaoming1);
        list.add(xiaoming2);
        list.add(xiaoming3);

        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFDataFormat dataFormat = workbook.createDataFormat();
        short format = dataFormat.getFormat("yyyy年MM月dd日");
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(format);

        HSSFSheet sheet = workbook.createSheet("student");
        sheet.setColumnWidth(3,20*256);
        HSSFRow row = sheet.createRow(0);
        String[] titles = {"标题","姓名","密码","日期"};
       for (int i = 0; i<titles.length; i++){
           String title = titles[i];
           HSSFCell cell = row.createCell(i);
           cell.setCellValue(title);
       }
        for (int i = 0; i<list.size(); i++){
            HSSFRow row1 = sheet.createRow(i + 1);
            row1.createCell(0).setCellValue(list.get(i).getId());
            row1.createCell(1).setCellValue(list.get(i).getUsername());
            row1.createCell(2).setCellValue(list.get(i).getPassword());

            HSSFCell cell = row1.createCell(3);
            cell.setCellValue(list.get(i).getBir());
            cell.setCellStyle(cellStyle);
        }

       workbook.write(new File("F:/三阶段框架/课堂记录/13.后期项目/150-后期项目/day7/studnet.xls"));
    }
}
