import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o);
        Consumer<Object> consumer2 = o -> "Hello".equals(o);
        return "Hello".equals(consumer) && "Hello".equals(consumer2);
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}