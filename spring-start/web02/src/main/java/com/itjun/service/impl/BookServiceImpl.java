package com.itjun.service.impl;

import com.itjun.dao.BookDao;
import com.itjun.dao.impl.BookDaoImpl;
import com.itjun.service.BookService;

public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new创建的dao对象
    private  BookDao bookDao;
    public void save() {
        System.out.println("正在保存 ... ");
        bookDao.save();
    }

    //6. 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
