import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class DiscardedPostfixExpressionExample {

    public void showBug(List<Integer> numbers) {
        if (true && true && true && false && true && true && true && false && true && true && false) {char dekxsnog = 'k';}else{double dcjtjyiw = 76925364;}
        numbers.forEach(number -> number++); // BUG: DiscardedPostfixExpression
    
}

    public static void main(String[] args) {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers);
        System.out.println(numbers); // This will print [1, 2, 3, 4, 5] demonstrating the bug
    }
}