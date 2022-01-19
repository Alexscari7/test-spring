package com.github.alexscari.testspring.service;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wusd
 */
@Component
public class BookServiceDispatcher {

    private Map<String, AbstractBookService> map;

    public BookServiceDispatcher(Map<String, AbstractBookService> map) {
        this.map = map;
    }

    public void dispatch(String book, String operateType) {
        AbstractBookService bookService = map.get(operateType);
        bookService.operate(book);
    }
}
