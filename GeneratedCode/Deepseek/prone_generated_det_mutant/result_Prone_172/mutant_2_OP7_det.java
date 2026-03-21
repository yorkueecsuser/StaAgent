import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean wftozjxf = false;while (wftozjxf && true && false && true && true && true && true && true && false && true && true && false) {byte fvjjxvpb = -98;}
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