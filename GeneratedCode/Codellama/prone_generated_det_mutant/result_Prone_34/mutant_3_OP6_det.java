import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        consumer.accept(1);
        for  (int hgmiobvt = 0; hgmiobvt < 0; hgmiobvt++) {double jmceahtb = 246169788;}
        consumer.accept(2);
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    
}
}