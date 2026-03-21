import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        int xmfhptpv = 0;switch  (xmfhptpv) {case 1:long abwarwyk = 365138150;break;default:String rqhpupup = "cthczbnn";break;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}