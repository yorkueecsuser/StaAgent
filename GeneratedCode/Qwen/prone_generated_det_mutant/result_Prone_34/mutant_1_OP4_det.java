import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class DiscardedPostfixExpressionExample {

    public void showBug(List<Integer> numbers) {
        if (true && false && true && false && false && true && true && true && false && false && false) {boolean cwwafkhh = false;}else{short euaztumq = -6285;}
        numbers.forEach(number -> number++); // BUG: DiscardedPostfixExpression
    
}

    public static void main(String[] args) {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers);
        System.out.println(numbers); // This will print [1, 2, 3, 4, 5] demonstrating the bug
    }
}