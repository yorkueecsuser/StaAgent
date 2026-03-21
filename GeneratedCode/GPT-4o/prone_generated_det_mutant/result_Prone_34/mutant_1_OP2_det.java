import java.util.function.Consumer;

class DiscardedPostfixExample {

    public void showBug(int startValue) {
        Consumer<Integer> consumer = (num) -> {
            num++; // BUG: DiscardedPostfixExpression
        };
        
        consumer.accept(startValue);
    }
public static void main(String [] args){
    DiscardedPostfixExample example = new DiscardedPostfixExample();
    example = new DiscardedPostfixExample();
    example.showBug(5);
}
}