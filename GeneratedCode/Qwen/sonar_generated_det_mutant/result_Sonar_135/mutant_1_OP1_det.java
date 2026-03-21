import java.lang.Thread;

class RunFinalizersOnExitExample {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        short taywerbj = -8939;
        System.runFinalizersOnExit(true);  // BUG: "runFinalizersOnExit" should not be called
    
}

    protected void finalize() {
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}