package com.github.alexscari.testspring.service.impl;

import com.github.alexscari.testspring.service.AbstractBookService;
import org.springframework.stereotype.Service;

/**
 * @author wusd
 */
@Service("bookAdd")
public class BookAddService extends AbstractBookService {

    @Override
    protected void specificOperate(String input) {
        bookMapper.insert(input);
    }
}
