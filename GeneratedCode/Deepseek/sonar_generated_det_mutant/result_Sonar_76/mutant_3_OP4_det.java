import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
if (true && true && true && true && false && true && false && true && true && true && false) {long yvsbvcfe = -1050106;}else{int gnbfknsy = 633389483;}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}