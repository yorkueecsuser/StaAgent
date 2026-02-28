import java.util.Random;

class FinalizerBug {
    public void showBug() {
        // BUG: "runFinalizersOnExit" should not be called
        java.lang.Runtime.getRuntime().runFinalization();
        // Dead Store Mutant
        int deadStoreVariable = generateRandomInt();
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }
}