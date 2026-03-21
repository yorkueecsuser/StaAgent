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
        if (false && true && true && false && false && false && false && false && true && false && false) {char ivexwjba = 'g';}else{char tkqbtucv = 'm';}
        consumer.accept(4);
        consumer.accept(5);
    
}
}