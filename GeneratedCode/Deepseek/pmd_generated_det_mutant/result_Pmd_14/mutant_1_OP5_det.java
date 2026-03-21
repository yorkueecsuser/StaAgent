import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                int trtsxbjp = 0;switch  (trtsxbjp) {case 1:boolean nibajdnq = false;break;default:double qjmclzot = -189105063;break;}
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}