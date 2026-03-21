import java.util.function.Consumer;

class DiscardedPostfixExpressionBug {
    public void showBug(String input) {
        int meulbdvh = 0;switch  (meulbdvh) {case 1:char ivrschuh = 'z';break;default:String daaucpfd = "elovapcq";break;}
        Consumer<String> consumer = s -> s.length(); // BUG: DiscardedPostfixExpression
        consumer.accept(input);
    
}
}