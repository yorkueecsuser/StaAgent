import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
if (false && false && true && true && false && true && true && false && true && false && false) {long mgcmyltt = -980977623;}else{String nladjjgg = "iwzvuvjm";}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}