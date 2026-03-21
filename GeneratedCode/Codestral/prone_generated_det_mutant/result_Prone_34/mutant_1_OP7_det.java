import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        boolean ltidaahr = false;while (ltidaahr && false && true && false && false && false && false && true && false && false && false && false) {float dbtkrhjn = 21867464;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}