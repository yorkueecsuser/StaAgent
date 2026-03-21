import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                boolean etjylchc = false;while (etjylchc && true && false && true && false && false && false && true && false && true && false && false) {int jjnhgmhg = -125511316;}
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}