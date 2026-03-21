import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for  (int mewnrjja = 0; mewnrjja < 0; mewnrjja++) {char jaxppuhq = 'k';}
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