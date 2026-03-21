import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                boolean vhpzrres = false;while (vhpzrres && false && true && false && false && true && true && true && false && true && false && false) {long spbxjrgt = 366874019;}
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}