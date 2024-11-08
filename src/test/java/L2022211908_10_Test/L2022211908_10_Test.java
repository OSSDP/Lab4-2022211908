package L2022211908_10_Test;

import Solution10.Solution10;
import org.junit.Test;  // JUnit 4的Test注解
import static org.junit.Assert.*;  // JUnit 4的断言类

public class L2022211908_10_Test {
    Solution10 solution = new Solution10();

    /**
     * 测试目的：测试正常的加法和减法操作。
     */
    @Test
    public void testFractionAddition() {
        assertEquals("0/1", solution.fractionAddition("-1/2+1/2")); // 基本加法
        assertEquals("1/3", solution.fractionAddition("-1/2+1/2+1/3")); // 加法和分数
        assertEquals("-1/6", solution.fractionAddition("1/3-1/2")); // 基本减法
        assertEquals("1/1", solution.fractionAddition("1/2+1/2")); // 整数结果
        assertEquals("1/1", solution.fractionAddition("1/3+1/3+1/3")); // 多个分数相加
        assertEquals("0/1", solution.fractionAddition("1/1-1/1")); // 结果为0
    }

    /**
     * 测试目的：测试边界值和极端情况。
     */
    @Test
    public void testEdgeCases() {
        assertEquals("5/6", solution.fractionAddition("5/6")); // 单个正分数
        assertEquals("-5/6", solution.fractionAddition("-5/6")); // 单个负分数
        assertEquals("1/2", solution.fractionAddition("1/2")); // 单个正分数
        assertEquals("0/1", solution.fractionAddition("0/1")); // 单个0
        assertEquals("1/2", solution.fractionAddition("1/2+1/3-1/3")); // 各种分数组合
    }

    /**
     * 测试目的：测试多个相同分数相加。
     */
    @Test
    public void testSameFractions() {
        assertEquals("2/3", solution.fractionAddition("1/3+1/3")); // 两个相同分数
        assertEquals("1/1", solution.fractionAddition("1/3+1/3+1/3")); // 三个相同分数
        assertEquals("2/1", solution.fractionAddition("1/2+1/2+1/2+1/2")); // 四个相同分数
    }

    /**
     * 测试目的：测试分数和整数相加。
     */
    @Test
    public void testFractionAndInteger() {
        assertEquals("1/1", solution.fractionAddition("1/2+1/2")); // 整数结果
        assertEquals("3/1", solution.fractionAddition("1/2+5/2")); // 大整数结果
    }

    /**
     * 测试目的：测试负分数和正分数的混合。
     */
    @Test
    public void testMixedFractions() {
        assertEquals("1/6", solution.fractionAddition("1/2-1/3")); // 正负分数
        assertEquals("-1/6", solution.fractionAddition("-1/2+1/3")); // 正负分数
        assertEquals("-5/6", solution.fractionAddition("-1/2-1/3")); // 两个负分数
    }
}
