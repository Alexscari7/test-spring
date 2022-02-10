package com.github.alexscari.testspring.model.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author wusd
 */
@SpringBootTest
class ValueEntityTest {

    @Autowired
    ValueEntity valueEntity;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void valueTest() {
        assertTrue("alexscari".equals(valueEntity.getName()));
    }

}