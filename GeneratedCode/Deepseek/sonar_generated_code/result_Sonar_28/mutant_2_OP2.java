import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        consumer = o -> "Hello".equals(o);
        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}