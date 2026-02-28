import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        while (false) {
            System.out.println("Unreachable code");
        }
        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}