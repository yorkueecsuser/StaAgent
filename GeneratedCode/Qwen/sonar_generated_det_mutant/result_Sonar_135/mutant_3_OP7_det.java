import java.lang.Thread;

class RunFinalizersOnExitExample {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean fzcirpxf = false;while (fzcirpxf && true && true && true && false && false && true && false && false && false && false && false) {short xzmoarng = 1722;}
        System.runFinalizersOnExit(true);  // BUG: "runFinalizersOnExit" should not be called
    
}

    protected void finalize() {
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}