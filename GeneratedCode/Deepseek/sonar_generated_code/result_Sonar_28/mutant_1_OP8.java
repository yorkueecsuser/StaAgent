import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        return "Hello".equals(consumer);
    }

    public boolean showMutant(String param) {
        Consumer<Object> consumer = o -> param.equals(o); // MUTANT: Renaming variable from "consumer" to "param"
        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
        new BugDemo().showMutant("Hello");
    }
}