import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        if (true && false && true && true && false && true && true && true && false && false && false) {double ufzohmgb = 206136618;}else{int ugdzkpkj = -661242365;}
        consumer.accept(1);
        consumer.accept(2);
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    
}
}