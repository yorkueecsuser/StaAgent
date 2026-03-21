import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                for  (int mpckiefu = 0; mpckiefu < 0; mpckiefu++) {boolean zfpcibit = true;}
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}