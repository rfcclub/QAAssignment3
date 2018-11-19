package msd.conestoga.org.qalab3;

import org.junit.Test;

import msd.conestoga.org.qalab3.business.Calculator;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void addition_ThreeAndFour_ReturnSeven() {
        Calculator calculator = new Calculator();
        int lhs = 3, rhs = 4;
        int result = calculator.addition(lhs, rhs);
        assertEquals(7, result);
    }
    @Test
    public void addition_ThreeAndNegativeFour_ReturnNegativeOne() {
        Calculator calculator = new Calculator();
        int lhs = 3, rhs = -4;
        int result = calculator.addition(lhs, rhs);
        assertEquals(-1, result);
    }
    @Test
    public void addition_NegativeThreeAndNegativeFour_ReturnNegativeSeven() {
        Calculator calculator = new Calculator();
        int lhs = -3, rhs = -4;
        int result = calculator.addition(lhs, rhs);
        assertEquals(-7, result);
    }

    @Test
    public void subtraction_FifteenAndTen_ReturnFive() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 10;
        int result = calculator.subtraction(lhs, rhs);
        assertEquals(5, result);
    }

    @Test
    public void subtraction_NegativeFifteenAndNegativeTen_ReturnNegativeFive() {
        Calculator calculator = new Calculator();
        int lhs = -15, rhs = -10;
        int result = calculator.subtraction(lhs, rhs);
        assertEquals(-5, result);
    }

    @Test
    public void subtraction_NegativeFifteenAndNegativeTen_ReturnNegativeTwentyFive() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = -10;
        int result = calculator.subtraction(lhs, rhs);
        assertEquals(25, result);
    }

    @Test
    public void multiplication_FifteenAndTwo_ReturnThirty() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 2;
        int result = calculator.multiplication(lhs, rhs);
        assertEquals(30, result);
    }

    @Test
    public void multiplication_NegativeFifteenAndTwo_ReturnNegativeThirty() {
        Calculator calculator = new Calculator();
        int lhs = -15, rhs = 2;
        int result = calculator.multiplication(lhs, rhs);
        assertEquals(-30, result);
    }

    @Test
    public void multiplication_FifteenAndZero_ReturnZero() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 0;
        int result = calculator.multiplication(lhs, rhs);
        assertEquals(0, result);
    }

    @Test
    public void division_SixteenAndTwo_ReturnEight() {
        Calculator calculator = new Calculator();
        int lhs = 16, rhs = 2;
        int result = calculator.division(lhs, rhs);
        assertEquals(8, result);
    }

    @Test
    public void division_NegativeSixteenAndTwo_ReturnNegativeEight() {
        Calculator calculator = new Calculator();
        int lhs = -16, rhs = 2;
        int result = calculator.division(lhs, rhs);
        assertEquals(-8, result);
    }

    @Test
    public void division_ZeroByFifteen_returnZero() {
        Calculator calculator = new Calculator();
        int lhs = 0, rhs = 15;
        int result = calculator.division(lhs, rhs);
        assertEquals(0, result);
    }

    @Test
    public void division_OneByOne_ReturnOne() {
        Calculator calculator = new Calculator();
        int lhs = 1, rhs = 1;
        int result = calculator.division(lhs, rhs);
        assertEquals(1, result);
    }

    @Test
    public void division_TwoByOne_ReturnTwo() {
        Calculator calculator = new Calculator();
        int lhs = 2, rhs = 1;
        int result = calculator.division(lhs, rhs);
        assertEquals(2, result);
    }

    @Test
    public void division_NineByThree_ReturnThree() {
        Calculator calculator = new Calculator();
        int lhs = 9, rhs = 3;
        int result = calculator.division(lhs, rhs);
        assertEquals(3, result);
    }
}
