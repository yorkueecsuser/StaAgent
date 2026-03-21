import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        if (true && false && true && true && true && true && true && false && true && false && false) {boolean rewhgpxi = true;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}