import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o); 
        return "Hello".equals(consumer);

        int whileCondition = 0; // Unreachable while loop
        while (whileCondition == 0) {
            whileCondition++;
        }
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}