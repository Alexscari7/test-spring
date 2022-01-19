package com.github.alexscari.testspring.service.impl;

import com.github.alexscari.testspring.service.AbstractBookService;
import org.springframework.stereotype.Service;

/**
 * @author wusd
 */
@Service("bookUpdate")
public class BookUpdService extends AbstractBookService {

    @Override
    protected void specificOperate(String input) {
        bookMapper.update(input);
    }
}
