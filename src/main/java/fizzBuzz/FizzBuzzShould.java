package fizzBuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzShould {

    @Parameters({
            "4,4",
            "Fizz,3",
            "Buzz,5",
            "FizzBuzz,15"
    })
    @Test
    public void fizz_buzz_general_converter(String expectedOutput, int inputNumber) {
        Assert.assertEquals(expectedOutput, FizzBuzz.convert(inputNumber));
    }
}
