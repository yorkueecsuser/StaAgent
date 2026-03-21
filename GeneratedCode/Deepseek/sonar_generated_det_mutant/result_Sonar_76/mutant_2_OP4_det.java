import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
if (true && true && false && false && false && true && true && false && false && true && false) {long dpljgmja = 949922373;}else{String mlzdwtaf = "biihfegd";}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}