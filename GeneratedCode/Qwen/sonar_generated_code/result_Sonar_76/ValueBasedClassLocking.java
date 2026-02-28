import java.util.Optional;

class ValueBasedClassLocking {

    public String showBug() {
        Optional<String> optionalString = Optional.of("Hello");
        synchronized (optionalString) {  // BUG: Value-based classes should not be used for locking
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return optionalString.get();
        }
    }

    public static void main(String[] args) {
        ValueBasedClassLocking example = new ValueBasedClassLocking();
        System.out.println(example.showBug());
    }
}