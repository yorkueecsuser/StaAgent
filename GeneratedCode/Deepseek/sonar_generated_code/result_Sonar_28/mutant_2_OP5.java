import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o);
        boolean unreachable = "false".equals("false"); // Mutation Operator: Unreachable switch statement
        return "Hello".equals(consumer);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}