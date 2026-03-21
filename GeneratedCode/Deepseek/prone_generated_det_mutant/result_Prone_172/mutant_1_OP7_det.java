import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            boolean oukolwry = false;while (oukolwry && false && true && false && true && false && false && true && true && true && true && false) {byte uivassps = 127;}
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