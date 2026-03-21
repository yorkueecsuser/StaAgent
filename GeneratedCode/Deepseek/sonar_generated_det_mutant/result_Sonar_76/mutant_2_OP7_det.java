import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
boolean rjvjtotj = false;while (rjvjtotj && false && true && true && false && false && true && true && true && false && false && false) {float ogroflta = 947375748;}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}