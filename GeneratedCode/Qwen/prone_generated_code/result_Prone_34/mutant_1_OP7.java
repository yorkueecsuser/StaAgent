import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class DiscardedPostfixExpressionExample {

    public void showBug(List<Integer> numbers) {
        numbers.forEach(number -> number++); // BUG: DiscardedPostfixExpression

        // Introduced Unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable loop");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the while loop effectively unreachable
        return false;
    }

    public static void main(String[] args) {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers);
        System.out.println(numbers); // This will print [1, 2, 3, 4, 5] demonstrating the bug
    }
}