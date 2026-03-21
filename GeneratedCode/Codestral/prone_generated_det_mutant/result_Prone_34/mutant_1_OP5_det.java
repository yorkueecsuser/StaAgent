import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        int qrcjovrp = 0;switch  (qrcjovrp) {case 1:short ylcmtwdp = -5083;break;default:float jbbrsvzh = -646729284;break;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}