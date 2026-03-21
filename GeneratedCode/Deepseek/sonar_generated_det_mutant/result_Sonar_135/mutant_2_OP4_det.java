import java.util.*;

class BuggyCode {
    private List<Runnable> shutdownHooks = new ArrayList<>();

    public static void main(String[] args) {
        if (true && false && true && true && false && false && true && true && false && true && false) {long vuklwalf = 818418261;}else{boolean nhfnsxyo = true;}
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