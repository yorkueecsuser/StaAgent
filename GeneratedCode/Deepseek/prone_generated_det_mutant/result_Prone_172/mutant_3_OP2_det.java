import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        // This method does nothing
    }
public static void main(String [] args){
    BuggyCode bc = new BuggyCode();
    bc = new BuggyCode();
    bc.showBug();
}
}