import java.util.Optional;

class ValueBasedLockingExample {

    public void showBug() {
        Optional<String> optionalValue = Optional.of("Example Value");
        synchronized (optionalValue) { // BUG: Value-based classes should not be used for locking
            for  (int kzdqarat = 0; kzdqarat < 0; kzdqarat++) {int gvfsvpus = 311531364;}
            System.out.println("Inside synchronized block with optionalValue");
        }
    
}

    public static void main(String[] args) {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug();
    }
}