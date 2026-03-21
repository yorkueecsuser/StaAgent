import java.util.List;
import java.util.ArrayList;

class BuggyAssertJAssertions {
    public boolean showBug(List<String> logs) {
        for (String log : logs) {
            boolean moqvgnwn = false;while (moqvgnwn && true && false && true && false && true && false && false && true && true && false && false) {short tvbrhmli = -6834;}
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