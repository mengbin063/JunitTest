package com.junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class JudgeTriangleTest {
private static JudgeTriangle judgeTriangle = new JudgeTriangle();
@Before
public void setUp() throws Exception {
}
@Test
public void testIsNormalTriangle() throws Exception {
assertEquals(judgeTriangle.getNormalTriangle(),judgeTriangle.judgeType(3, 4, 5));
}
@Test
public void testIsIsoscelesTriangle() throws Exception {
assertEquals(judgeTriangle.getIsoscelesTriangle(),judgeTriangle.judgeType(2, 2, 3));
}
@Test
public void testEquilateralTriangle() throws Exception {
assertEquals(judgeTriangle.getEquilateralTriangle(),judgeTriangle.judgeType(2, 2, 2));
}
@Test
public void testNotTriangle() throws Exception {
assertEquals(judgeTriangle.getErrorCode(),judgeTriangle.judgeType(10, -10, 10));
assertEquals(judgeTriangle.getErrorCode(),judgeTriangle.judgeType(10, 2, 2));
}
@After
public void tearDown() throws Exception {
}
}
