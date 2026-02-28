import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class DiscardedPostfixExpressionExample {

    public void showBug(List<Integer> numbers) {
        numbers.forEach(number -> number++); // BUG: DiscardedPostfixExpression

        // Mutant code with renaming of variable 'numbers' to 'a'
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        a.forEach(b -> b++);
        System.out.println(a); // This will print [1, 2, 3, 4, 5] demonstrating the bug in mutant
    }

    public static void main(String[] args) {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers);
        System.out.println(numbers); // This will print [1, 2, 3, 4, 5] demonstrating the bug
    }
}