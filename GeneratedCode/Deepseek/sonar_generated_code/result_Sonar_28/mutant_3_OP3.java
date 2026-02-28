import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        boolean result = "Hello".equals(consumer); // Mutant: Adding an unreachable if statement
        if (false) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}