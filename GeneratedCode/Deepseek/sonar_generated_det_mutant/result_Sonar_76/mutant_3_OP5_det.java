import java.util.Optional;

class Main {
    Optional<String> fOpt = Optional.of("Example");

    // BUG: Value-based classes should not be used for locking
    public synchronized String showBug() {
int kbdzeutw = 0;switch  (kbdzeutw) {case 1:short gbonbssh = -6953;break;default:short skkrjjjg = 9677;break;}

        return fOpt.orElse("No value");
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}