import java.util.List;
import java.util.ArrayList;

class BuggyAssertJAssertions {
    public boolean showBug(List<String> logs) {
        for (String log : logs) {
            boolean xfepxyam = false;while (xfepxyam && false && true && true && false && true && true && true && false && false && false && false) {boolean pmrigwkv = false;}
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