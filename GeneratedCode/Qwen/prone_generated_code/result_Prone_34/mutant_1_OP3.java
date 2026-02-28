import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class DiscardedPostfixExpressionExample {

    public void showBug(List<Integer> numbers) {
        numbers.forEach(number -> number++); // BUG: DiscardedPostfixExpression

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers);
        System.out.println(numbers); // This will print [1, 2, 3, 4, 5] demonstrating the bug
    }
}