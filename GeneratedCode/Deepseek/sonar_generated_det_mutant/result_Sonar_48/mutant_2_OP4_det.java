import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        if (true && false && true && true && false && true && true && false && true && true && false) {char fealyprz = 'u';}else{char lfivgicp = 'n';}
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