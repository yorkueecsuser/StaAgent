import java.util.function.Consumer;

class DiscardedPostfixExpression {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> x++;
        showBug(consumer);
    }

    public static void showBug(Consumer<Integer> consumer) {
        int gnvmtrnb = 0;switch  (gnvmtrnb) {case 1:boolean ocwcjysn = false;break;default:boolean rpdseuwp = true;break;}
        consumer.accept(1);
        consumer.accept(2);
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    
}
}