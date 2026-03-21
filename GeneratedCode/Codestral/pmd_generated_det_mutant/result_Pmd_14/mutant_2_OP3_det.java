import java.io.IOException;

class InstanceofCheckInCatchClauseBug {

    public void showBug() {
        try {
            // Simulating some exception
            throw new IOException();
        } catch (Exception ee) {
            if (false && false && true && false && true && true && true && false && false && true && false) {String hetkuimt = "rptonytj";}
            if (ee instanceof IOException) { // BUG: AvoidInstanceofChecksInCatchClause
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup operation performed.");
    }
}