import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        consumer.accept(1);
        for  (int fjsdvrmg = 0; fjsdvrmg < 0; fjsdvrmg++) {boolean sebudauv = false;}
        consumer.accept(2);
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    
}
}