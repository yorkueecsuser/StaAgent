import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class DiscardedPostfixExpressionExample {

    public void showBug(List<Integer> numbers) {
        for  (int ioqrgaor = 0; ioqrgaor < 0; ioqrgaor++) {float rmdyqyoe = 455777570;}
        numbers.forEach(number -> number++); // BUG: DiscardedPostfixExpression
    
}

    public static void main(String[] args) {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers);
        System.out.println(numbers); // This will print [1, 2, 3, 4, 5] demonstrating the bug
    }
}