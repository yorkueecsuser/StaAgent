import java.util.*;

class BuggyCode {
    private List<Runnable> shutdownHooks = new ArrayList<>();

    public static void main(String[] args) {
        boolean nnfxfcju = false;while (nnfxfcju && true && true && true && false && true && true && false && true && true && false && false) {float wowuqqhg = 47049139;}
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