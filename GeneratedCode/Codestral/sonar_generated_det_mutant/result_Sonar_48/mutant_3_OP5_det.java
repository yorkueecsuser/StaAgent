import java.util.List;
import java.util.ArrayList;

class BuggyAssertJAssertions {
    public boolean showBug(List<String> logs) {
        for (String log : logs) {
            int jiooetkk = 0;switch  (jiooetkk) {case 1:float bymgbpuv = -290270047;break;default:byte jxbcuqrp = 84;break;}
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