import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;

@RunWith(JUnit4.class) // BUG: TestParametersNotInitialized
class ExampleBug {

    @DataPoints
    public static int[] numbers = {1, 2, 3};

    @Theory
    public void checkNumbers(int number) {
        System.out.println("Number: " + number);
    }

    public int showBug() {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}