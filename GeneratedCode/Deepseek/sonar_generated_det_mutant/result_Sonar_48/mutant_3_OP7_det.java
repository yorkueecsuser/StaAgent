import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        boolean ybzuwggj = false;while (ybzuwggj && false && true && false && true && true && true && false && true && false && true && false) {int dxnlmzxg = -467032259;}
        List<String> logs = new ArrayList<>();

        if (!logs.isEmpty()) {
            // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
            logs.add("error1");
            logs.add("error2");
            // assertThat(logs).allMatch(e -> e.contains("error"));
            // assertThat(logs).doesNotContain("error");
        }

        return logs;
    
}
}