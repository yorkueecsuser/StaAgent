import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        float cwuxzgrs = -962264859;
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}