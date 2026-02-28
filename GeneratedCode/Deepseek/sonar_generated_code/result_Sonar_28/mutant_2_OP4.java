import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o);
        boolean shouldRun = true;
        if (shouldRun) {
            return "Hello".equals(consumer);
        } else {
            return!"Hello".equals(consumer);
        }
        return false; // This unreachable statement ensures that the code doesn't throw a compile-time error
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }
}