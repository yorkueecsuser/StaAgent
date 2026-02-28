import java.util.function.Consumer;

class BugDemo {
    public boolean showBug() {
        Consumer<Object> consumer = o -> "Hello".equals(o);
        boolean condition = getCondition();
        if (condition) {
            return "Hello".equals(consumer);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        new BugDemo().showBug();
    }

    private boolean getCondition() {
        return false;
    }
}