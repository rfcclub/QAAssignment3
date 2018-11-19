package msd.conestoga.org.qalab3;

import org.junit.Test;

import msd.conestoga.org.qalab3.business.Calculator;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void add_ThreeAndFour_ReturnSeven() {
        Calculator calculator = new Calculator();
        int lhs = 3, rhs = 4;
        int result = calculator.add(lhs, rhs);
        assertEquals(7, result);
    }
    @Test
    public void add_ThreeAndNegativeFour_ReturnNegativeOne() {
        Calculator calculator = new Calculator();
        int lhs = 3, rhs = -4;
        int result = calculator.add(lhs, rhs);
        assertEquals(-1, result);
    }
    @Test
    public void add_NegativeThreeAndNegativeFour_ReturnNegativeSeven() {
        Calculator calculator = new Calculator();
        int lhs = -3, rhs = -4;
        int result = calculator.add(lhs, rhs);
        assertEquals(-7, result);
    }

    @Test
    public void subtract_FifteenAndTen_ReturnFive() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 10;
        int result = calculator.subtract(lhs, rhs);
        assertEquals(5, result);
    }

    @Test
    public void subtract_NegativeFifteenAndNegativeTen_ReturnNegativeFive() {
        Calculator calculator = new Calculator();
        int lhs = -15, rhs = -10;
        int result = calculator.subtract(lhs, rhs);
        assertEquals(-5, result);
    }

    @Test
    public void subtract_NegativeFifteenAndNegativeTen_ReturnNegativeTwentyFive() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = -10;
        int result = calculator.subtract(lhs, rhs);
        assertEquals(25, result);
    }

    @Test
    public void multiply_FifteenAndTwo_ReturnThirty() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 2;
        int result = calculator.multiply(lhs, rhs);
        assertEquals(30, result);
    }

    @Test
    public void multiply_NegativeFifteenAndTwo_ReturnNegativeThirty() {
        Calculator calculator = new Calculator();
        int lhs = -15, rhs = 2;
        int result = calculator.multiply(lhs, rhs);
        assertEquals(-30, result);
    }

    @Test
    public void multiply_FifteenAndZero_ReturnZero() {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 0;
        int result = calculator.multiply(lhs, rhs);
        assertEquals(0, result);
    }

    @Test
    public void divide_SixteenAndTwo_ReturnEight() {
        Calculator calculator = new Calculator();
        int lhs = 16, rhs = 2;
        int result = calculator.divide(lhs, rhs);
        assertEquals(8, result);
    }

    @Test
    public void divide_NegativeSixteenAndTwo_ReturnNegativeEight() {
        Calculator calculator = new Calculator();
        int lhs = -16, rhs = 2;
        int result = calculator.divide(lhs, rhs);
        assertEquals(-8, result);
    }

    @Test(expected = ArithmeticException.class)
    public void divide_FifteenByZero_ThrowException() throws Exception {
        Calculator calculator = new Calculator();
        int lhs = 15, rhs = 0;
        int result = calculator.divide(lhs, rhs);
        assertEquals(0, result);
    }

    @Test
    public void divide_ZeroByFifteen_returnZero() {
        Calculator calculator = new Calculator();
        int lhs = 0, rhs = 15;
        int result = calculator.divide(lhs, rhs);
        assertEquals(0, result);
    }

//    @Test
//    public void square_Three_ReturnNine() {
//        int squareNumber = 3;
//        Calculator calculator = new Calculator();
//        int result = calculator.square(squareNumber);
//        assertEquals(9, result);
//    }
//
//    @Test
//    public void square_Zero_ReturnZero() {
//        int squareNumber = 0;
//        Calculator calculator = new Calculator();
//        int result = calculator.square(squareNumber);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void square_MinusTwo_ReturnFour() {
//        int squareNumber = -2;
//        Calculator calculator = new Calculator();
//        int result = calculator.square(squareNumber);
//        assertEquals(4, result);
//    }
}
