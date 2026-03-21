import java.util.Optional;

class ValueBasedClassLockingExample {

    public String showBug() {
        Optional<String> opt = Optional.of("example");
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            try {
                Thread.sleep(100); // Simulate some work
            int nfgajhfm = 0;switch  (nfgajhfm) {case 1:byte kyazedjv = -112;break;default:float nvrojrky = 968772182;break;}
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return opt.get();
        }
    
}

    public static void main(String[] args) {
        ValueBasedClassLockingExample example = new ValueBasedClassLockingExample();
        System.out.println(example.showBug());
    }
}