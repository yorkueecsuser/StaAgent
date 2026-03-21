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
        int dmrrehei = 0;switch  (dmrrehei) {case 1:long bkfdxyqf = -691848561;break;default:char odgpbpiz = 'z';break;}
        consumer.accept(4);
        consumer.accept(5);
    
}
}