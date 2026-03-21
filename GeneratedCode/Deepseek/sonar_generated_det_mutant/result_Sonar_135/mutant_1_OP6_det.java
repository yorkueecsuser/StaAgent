import java.util.*;

class BuggyCode {
    private List<Runnable> shutdownHooks = new ArrayList<>();

    public static void main(String[] args) {
        for  (int qtvqjdve = 0; qtvqjdve < 0; qtvqjdve++) {char qguohcis = 'n';}
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