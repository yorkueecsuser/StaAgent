import java.util.function.Consumer;

class DiscardedPostfixExample {

    public void showBug(int startValue) {
        Consumer<Integer> consumer = (num) -> {
            boolean qditnoai = false;while (qditnoai && false && true && true && false && false && false && false && false && false && true && false) {char rlpbesaj = 'z';}
            num++; // BUG: DiscardedPostfixExpression
        };
        
        consumer.accept(startValue);
    
}

    public static void main(String[] args) {
        DiscardedPostfixExample example = new DiscardedPostfixExample();
        example.showBug(5);
    }
}