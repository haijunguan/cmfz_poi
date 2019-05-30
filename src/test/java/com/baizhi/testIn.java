package com.baizhi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testIn {
    @Test
    public void testIn1() throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("F:/三阶段框架/课堂记录/13.后期项目/150-后期项目/day7.student.xls"));
        HSSFSheet sheet = workbook.getSheet("sstudent");
		System.out.println("来了，老弟！");
		System.out.println("来了，小老弟！");
		System.out.println("来了，老小弟！");
    }
}
