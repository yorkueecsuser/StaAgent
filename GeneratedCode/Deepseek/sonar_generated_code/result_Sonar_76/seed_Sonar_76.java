import java.util.Optional;

class BugDemo {
    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.of("test");
        synchronized (optional.get()) {  // BUG: Value-based classes should not be used for locking
            System.out.println(optional);
        }
    }
}