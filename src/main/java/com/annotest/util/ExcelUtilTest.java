package com.annotest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.annotest.bean.Users;

public class ExcelUtilTest {

    private Logger logger = Logger.getLogger(ExcelUtilTest.class);

    @Test
    public void exportExcel() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        // 初始化数据  
        List<Users> list = new ArrayList<Users>();  

        Users vo = new Users();  
        vo.setId(1);  
        vo.setName("李坤");  
        vo.setAge(26);  
        vo.setClazz("五期提高班");  
        vo.setCompany("天融信");  
        list.add(vo);  

        Users vo2 = new Users();  
        vo2.setId(2);  
        vo2.setName("曹贵生");  
        vo2.setClazz("五期提高班");  
        vo2.setCompany("中银");  
        list.add(vo2);  

        Users vo3 = new Users();  
        vo3.setId(3);  
        vo3.setName("柳波");  
        vo3.setClazz("五期提高班");  
        list.add(vo3);  

        FileOutputStream out = null;  
        try {  
            out = new FileOutputStream("d:\\success3.xls");  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
        ExcelUtil<Users> util = new ExcelUtil<Users>(Users.class);// 创建工具类.  
        util.exportExcel(list, "学生信息", out);// 导出  
        logger.info("----执行完毕----------");  
    }

    @Test
    public void importExcel(){
        FileInputStream fis = null;  
        try {  
            fis = new FileInputStream("d:\\success3.xls");  
            ExcelUtil<Users> util = new ExcelUtil<Users>(  
                    Users.class);// 创建excel工具类  
            List<Users> list = util.importExcel("学生信息", fis);// 导入  
            logger.info(list);  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }
    }

}