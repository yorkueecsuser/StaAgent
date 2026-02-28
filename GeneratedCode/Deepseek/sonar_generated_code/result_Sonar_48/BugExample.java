import java.util.List;
import java.util.ArrayList;

class BugExample {
    public static void main(String[] args) {
        showBug();
    }

    public static List<String> showBug() {
        List<String> logs = getLogs();
        // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        // Assertions.assertThat(logs).isNotEmpty().allMatch(e -> e.contains("error"));
        // Assertions.assertThat(logs).isNotEmpty().doesNotContain("error");
        return logs;
    }

    public static List<String> getLogs() {
        List<String> logs = new ArrayList<>();
        logs.add("warning");
        return logs;
    }
}