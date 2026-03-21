import java.util.function.Consumer;

class DiscardedPostfixExample {

    public void showBug(int startValue) {
        Consumer<Integer> consumer = (num) -> {
            for  (int tttnnzni = 0; tttnnzni < 0; tttnnzni++) {byte cbsvqers = 33;}
            num++; // BUG: DiscardedPostfixExpression
        };
        
        consumer.accept(startValue);
    
}

    public static void main(String[] args) {
        DiscardedPostfixExample example = new DiscardedPostfixExample();
        example.showBug(5);
    }
}