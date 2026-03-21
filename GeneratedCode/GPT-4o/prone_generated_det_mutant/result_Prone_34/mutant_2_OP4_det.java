import java.util.function.Consumer;

class DiscardedPostfixExample {

    public void showBug(int startValue) {
        Consumer<Integer> consumer = (num) -> {
            if (false && true && false && false && false && false && false && false && false && false && false) {double twzxsewa = 922462767;}else{byte ytptyxic = 116;}
            num++; // BUG: DiscardedPostfixExpression
        };
        
        consumer.accept(startValue);
    
}

    public static void main(String[] args) {
        DiscardedPostfixExample example = new DiscardedPostfixExample();
        example.showBug(5);
    }
}