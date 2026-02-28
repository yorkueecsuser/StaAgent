import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o);

        // Mutation Operator: Unreachable for loop
        // The condition of the inserted loop is always false to make it unreachable.
        boolean shouldRun = false;
        for (int i = 0; shouldRun; i++) {
            // no-op
        }

        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}