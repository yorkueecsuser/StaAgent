import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;

class TheoryButNoTheoriesBug {
    @DataPoint
    public static int dataPoint = 5;

    @Theory
    public void shouldFail(int number) {
        System.out.println("The number is: " + number); // BUG: TheoryButNoTheories
    }

    // Public method to demonstrate the bug
    public void showBug() {
        // As the default JUnit 4 runner is used, this will not run the @Theory annotated method
        // The @DataPoint annotation is also not recognized without the Theories runner
        shouldFail(dataPoint);
    }

    // This is an additional test case to demonstrate the bug
    // This would run if the Theories runner was used
    @Test
    public void shouldNotFail() {
        // This test case would pass as the @DataPoint is not used in the method
        shouldFail(10);
    }
}