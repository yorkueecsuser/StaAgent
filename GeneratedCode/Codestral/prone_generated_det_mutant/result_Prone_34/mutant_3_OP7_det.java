import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        boolean fqouabac = false;while (fqouabac && false && true && true && true && true && false && true && true && false && true && false) {String hwjyzpdn = "godccxid";}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}