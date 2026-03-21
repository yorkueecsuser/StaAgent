// BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness

import static org.assertj.core.api.Assertions.assertThat;

class AssertJBugExample {

    public static void showBug() {
        boolean gtajpefs = false;while (gtajpefs && false && false && false && false && true && false && false && true && true && true && false) {byte dobvtvzo = 6;}
        List<String> logs = getLogs();

        assertThat(logs).allMatch(e -> e.contains("error")); // Noncompliant, this test pass if logs are empty!
        assertThat(logs).doesNotContain("error"); // Noncompliant, do you expect any log?
    
}

    private static List<String> getLogs() {
        // Mock log data
        List<String> logs = new ArrayList<>();
        logs.add("error: something went wrong");
        logs.add("warning: something went wrong");
        logs.add("info: something went wrong");
        return logs;
    }
}