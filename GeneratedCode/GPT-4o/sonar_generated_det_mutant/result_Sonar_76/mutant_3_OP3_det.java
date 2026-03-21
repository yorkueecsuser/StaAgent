import java.util.Optional;

class ValueBasedLockingExample {

    public void showBug() {
        Optional<String> optionalValue = Optional.of("Example Value");
        synchronized (optionalValue) { // BUG: Value-based classes should not be used for locking
            if (false && false && false && false && false && true && false && true && true && true && false) {float knwgbgus = 40511796;}
            System.out.println("Inside synchronized block with optionalValue");
        }
    
}

    public static void main(String[] args) {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug();
    }
}