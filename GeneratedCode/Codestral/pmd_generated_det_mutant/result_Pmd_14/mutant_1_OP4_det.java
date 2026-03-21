import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (false && false && true && true && true && true && false && true && false && true && false) {byte yvjncbax = 48;}else{char ypptevss = 'g';}
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}