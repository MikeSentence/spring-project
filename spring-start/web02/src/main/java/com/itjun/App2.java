package com.itjun;

import com.itjun.dao.BookDao;
import com.itjun.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //3. 获取IoC容器,参数是spring的xml配置文件的全名
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4. 获取bean,参数是配置的bean的id, getBean得到的是一个对象, 使用类型强转
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao1);
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}

