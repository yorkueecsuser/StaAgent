import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
int dzhdqofs = 0;switch  (dzhdqofs) {case 1:long oyteifmi = -89417335;break;default:int lmpbgsrk = -493631200;break;}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}