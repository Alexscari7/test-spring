package com.github.alexscari.testspring.mapper;

import org.springframework.stereotype.Component;

/**
 * @author wusd
 */
@Component
public class BookMapper {

    public void insert(String book) {
        System.out.println("新增成功：" + book);
    }

    public void update(String book) {
        System.out.println("更新成功：" + book);
    }

}
