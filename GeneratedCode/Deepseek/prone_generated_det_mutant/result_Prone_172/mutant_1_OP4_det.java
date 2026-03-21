import java.util.*;

class BuggyCode {
    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (false && true && true && false && true && false && false && false && false && true && false) {byte tvafdbam = 91;}else{byte akpifwto = -90;}
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