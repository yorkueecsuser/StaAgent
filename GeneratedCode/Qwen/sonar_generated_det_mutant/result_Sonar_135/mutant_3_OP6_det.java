import java.lang.Thread;

class RunFinalizersOnExitExample {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int iirwbasq = 0; iirwbasq < 0; iirwbasq++) {String kdfzkzyw = "aiayvfjw";}
        System.runFinalizersOnExit(true);  // BUG: "runFinalizersOnExit" should not be called
    
}

    protected void finalize() {
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}