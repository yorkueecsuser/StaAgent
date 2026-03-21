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
        int acpfvmqy = 0;switch  (acpfvmqy) {case 1:long jexhhcbk = 633119083;break;default:double iodrftat = -360079776;break;}
        consumer.accept(4);
        consumer.accept(5);
    
}
}