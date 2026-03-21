import java.util.List;
import java.util.ArrayList;

class BuggyAssertJAssertions {
    public boolean showBug(List<String> logs) {
        for (String log : logs) {
            int tcwvlbhf = 0;switch  (tcwvlbhf) {case 1:byte xnogrdey = 67;break;default:int fbyphula = 891130822;break;}
            if (!log.contains("error")) {
                return false;
            }
        }
        return true; // BUG: should also test for emptiness
    
}

    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        BuggyAssertJAssertions buggyAssertions = new BuggyAssertJAssertions();
        boolean result = buggyAssertions.showBug(logs);
        System.out.println("Result: " + result);
    }
}