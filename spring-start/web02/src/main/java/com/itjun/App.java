package com.itjun;

import com.itjun.service.BookService;
import com.itjun.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
