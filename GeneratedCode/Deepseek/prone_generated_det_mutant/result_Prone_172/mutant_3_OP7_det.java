import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean bxcznbbb = false;while (bxcznbbb && false && true && true && true && false && true && true && true && true && true && false) {float jvkqhhdq = 726701669;}
                preventMissionCriticalDisasters();
            
}
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        // This method does nothing
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
    }
}