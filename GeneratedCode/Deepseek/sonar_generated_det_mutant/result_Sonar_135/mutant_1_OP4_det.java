import java.util.*;

class BuggyCode {
    private List<Runnable> shutdownHooks = new ArrayList<>();

    public static void main(String[] args) {
        if (true && false && true && false && true && false && false && true && false && false && false) {int yfpltxgo = -389917261;}else{long amwcmijl = 655137526;}
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    
}

    public void showBug() {
        Runnable shutdownHook = new Runnable() {
            public void run() {
                doShutdownOperations();
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook));
        shutdownHooks.add(shutdownHook);
    }

    private void doShutdownOperations() {
        // Simulating shutdown operations
        System.out.println("Shutdown operations are being done.");
    }
}