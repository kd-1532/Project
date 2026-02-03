package com.clientdata.project.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

public class BasicTest {

    @MockitoBean
    Basic basic;

    @BeforeEach
    void setUp() {
        basic = new Basic();
    }

    @Test
    void testMethod(){
        String [] result = basic.method();
        assert result.length == 3;
        assert result[0].equals("echo");
    }
}
