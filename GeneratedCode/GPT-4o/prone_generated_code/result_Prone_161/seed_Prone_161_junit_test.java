import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class TheoryExample {

    @DataPoint
    public static int positiveNumber = 42;

    @DataPoint
    public static int negativeNumber = -42;

    @Theory // BUG: TheoryButNoTheories
    public void theoryMethod(int number) {
        System.out.println("Number is: " + number);
    }

    public void showBug() {
        theoryMethod(positiveNumber); // Demonstration of the bug
        theoryMethod(negativeNumber); // Demonstration of the bug
    }

    public static void main(String[] args) {
        TheoryExample example = new TheoryExample();
        example.showBug();
    }
}