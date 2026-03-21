import java.util.function.Consumer;

class DiscardedPostfixExample {

    public void showBug(int startValue) {
        Consumer<Integer> consumer = (num) -> {
            if (true && true && false && true && false && true && true && true && false && false && false) {int wtptppaq = 376308258;}
            num++; // BUG: DiscardedPostfixExpression
        };
        
        consumer.accept(startValue);
    
}

    public static void main(String[] args) {
        DiscardedPostfixExample example = new DiscardedPostfixExample();
        example.showBug(5);
    }
}