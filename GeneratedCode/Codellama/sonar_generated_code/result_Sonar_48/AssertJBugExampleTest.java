import static org.junit.Assert.*;

class AssertJBugExampleTest {

    @Test
    public void testBug1() {
        List<String> logs = getLogs();

        assertThat(logs).isNotEmpty().allMatch(e -> e.contains("error"));
    }

    @Test
    public void testBug2() {
        List<String> logs = getLogs();

        assertThat(logs).doesNotContain("error").isEmpty();
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