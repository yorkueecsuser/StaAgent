import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        if (false && true && false && false && true && true && false && false && true && true && false) {short hixqktct = 7003;}else{float dflvcdjj = 513631147;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}