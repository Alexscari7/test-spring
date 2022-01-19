package com.github.alexscari.testspring.service;

import com.github.alexscari.testspring.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wusd
 */
public abstract class AbstractBookService {

    @Autowired
    protected BookMapper bookMapper;

    public final void operate(String input) {
        System.out.println("统一交由抽象类处理");
        specificOperate(input);
    }

    abstract protected void specificOperate(String input);

}
