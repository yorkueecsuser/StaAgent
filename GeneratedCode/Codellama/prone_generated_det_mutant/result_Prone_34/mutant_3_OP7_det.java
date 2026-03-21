import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        consumer.accept(1);
        consumer.accept(2);
        boolean zxltifqz = false;while (zxltifqz && true && true && false && false && false && true && false && false && false && true && false) {char mzcwdsre = 'p';}
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    
}
}