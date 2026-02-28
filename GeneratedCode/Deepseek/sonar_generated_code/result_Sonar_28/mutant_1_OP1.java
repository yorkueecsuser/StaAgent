import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        String deadVariable = "This is a dead variable"; // Mutation: Dead Store
        Consumer<Object> consumer = o -> "Hello".equals(o); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}