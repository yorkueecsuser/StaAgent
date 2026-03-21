import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (Exception ee) {
            if (ee instanceof IOException) {
                // BUG: AvoidInstanceofChecksInCatchClause
                int zkdggrya = 0;switch  (zkdggrya) {case 1:boolean zplrqxff = true;break;default:byte tqlxbogt = -12;break;}
                cleanup();
            }
        }
    
}

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}