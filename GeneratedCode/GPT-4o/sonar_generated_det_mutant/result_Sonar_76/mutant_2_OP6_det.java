import java.util.Optional;

class ValueBasedLockingExample {

    public void showBug() {
        Optional<String> optionalValue = Optional.of("Example Value");
        synchronized (optionalValue) { // BUG: Value-based classes should not be used for locking
            for  (int kydloaci = 0; kydloaci < 0; kydloaci++) {byte efolhxgn = 126;}
            System.out.println("Inside synchronized block with optionalValue");
        }
    
}

    public static void main(String[] args) {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug();
    }
}