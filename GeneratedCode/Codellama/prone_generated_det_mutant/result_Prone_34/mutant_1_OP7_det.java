import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        consumer.accept(1);
        consumer.accept(2);
        consumer.accept(3);
        boolean mclnwatl = false;while (mclnwatl && false && false && true && false && true && true && true && true && false && false && false) {String sqmxvjhs = "unqjhdxx";}
        consumer.accept(4);
        consumer.accept(5);
    
}
}