import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        if (false && true && true && false && true && true && true && true && false && false && false) {short ahlzucay = 7711;}else{byte akmsxxam = -23;}
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