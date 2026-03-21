import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        if (true && true && true && true && false && true && true && true && true && true && false) {int ehwkmqvk = -276911712;}else{double yjorsnzx = 497420766;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}