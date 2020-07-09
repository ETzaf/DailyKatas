package fizzBuzz;

public class FizzBuzz {

    public static String convert(int toBeConverted) {

        if (divisionBy(toBeConverted, 3) && divisionBy(toBeConverted, 5)) {
            return "FizzBuzz";
        }

        if (divisionBy(toBeConverted, 3)) {
            return "Fizz";
        }

        if (divisionBy(toBeConverted, 5)) {
            return "Buzz";
        }

        return String.valueOf(toBeConverted);
    }

    private static boolean divisionBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
