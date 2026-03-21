import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        long fwpreudh = 199070253;
        consumer.accept(1);
        consumer.accept(2);
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    
}
}