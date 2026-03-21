import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            int vvpeedof = 0;switch  (vvpeedof) {case 1:double gccyavwg = 578783039;break;default:boolean rvvhmykl = false;break;}
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