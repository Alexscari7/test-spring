package com.github.alexscari.testspring.model.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wusd
 */
@Component
public class ValueEntity {

    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }
}
