import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
if (true && true && true && false && true && true && false && true && false && true && false) {byte ujcsjimf = 51;}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}