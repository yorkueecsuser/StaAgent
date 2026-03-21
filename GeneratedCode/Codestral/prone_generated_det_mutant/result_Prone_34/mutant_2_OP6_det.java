import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        for  (int xnzwfkyk = 0; xnzwfkyk < 0; xnzwfkyk++) {boolean bbhfmuhj = true;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}