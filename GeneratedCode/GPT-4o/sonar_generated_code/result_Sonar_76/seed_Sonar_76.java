import java.util.Optional;

class ValueBasedLockingExample {

    public void showBug() {
        Optional<String> optionalValue = Optional.of("Hello World");
        
        synchronized (optionalValue) {  // BUG: Value-based classes should not be used for locking
            System.out.println("Synchronized block with Optional");
        }
    }

    public static void main(String[] args) {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug();
    }
}