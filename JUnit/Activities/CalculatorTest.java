package examples;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    @DisplayName("Not required")
    public void addTest(){
        int num1 = 3;
        int num2 = 5;
        int total = calc.add(num1, num2);
        System.out.println(total);
    }

    @Test
    @Disabled("Not required")
    public void multiplyTest(){

    }

    public class Numbers {
        public static boolean isOdd(int number) {
            return number % 2 != 0;
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {

        int result = number + 1;
        System.out.println(result);

    }
}
