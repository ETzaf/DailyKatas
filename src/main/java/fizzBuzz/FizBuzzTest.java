package fizzBuzz;

import org.junit.Test;

public class FizBuzzTest {

    @Test
    public void printOneHundredFizzBuzzes() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzz.convert(i));
        }
    }

}
