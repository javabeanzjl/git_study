package com.le.day4.feat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 程序员阿乐
 * @description
 * @createDate 2025/3/17 08:52
 */
// @SpringBootTest
public class CalculatorTest {

    @Test
    public void testAdd() {
        Integer result = Calculator.add(1, 2);
        Integer trueResult = 3;
        assertEquals(trueResult, result);
    }
}
