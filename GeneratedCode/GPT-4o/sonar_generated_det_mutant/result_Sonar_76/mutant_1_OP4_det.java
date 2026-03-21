import java.util.Optional;

class ValueBasedLockingExample {

    public void showBug() {
        Optional<String> optionalValue = Optional.of("Example Value");
        synchronized (optionalValue) { // BUG: Value-based classes should not be used for locking
            if (true && false && true && true && false && false && false && true && false && false && false) {char uewxjmwa = 'k';}else{int nqszjsau = 228903960;}
            System.out.println("Inside synchronized block with optionalValue");
        }
    
}

    public static void main(String[] args) {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug();
    }
}