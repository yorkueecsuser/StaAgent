import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        for  (int iotveley = 0; iotveley < 0; iotveley++) {byte lobrftwq = -117;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}