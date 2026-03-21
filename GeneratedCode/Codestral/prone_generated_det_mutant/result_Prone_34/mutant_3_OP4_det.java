import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        if (true && true && true && false && false && false && false && false && true && true && false) {double uhichfsc = -532943167;}else{char edccybwu = 'i';}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}