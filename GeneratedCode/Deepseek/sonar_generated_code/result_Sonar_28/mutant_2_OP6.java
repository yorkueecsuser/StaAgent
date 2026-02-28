import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers

        // Mutation 1: Unreachable for loop starts
        for (int i = 0; false; i++) {
            System.out.println("This is mutation 1: Unreachable for loop");
        }
        // Mutation 1: Unreachable for loop ends

        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }

    // Mutation 2: Unreachable for loop starts
    static {
        for (int i = 0; false; i++) {
            System.out.println("This is mutation 2: Unreachable for loop");
        }
    }
    // Mutation 2: Unreachable for loop ends
}