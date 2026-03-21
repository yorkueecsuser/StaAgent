import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        if (true && true && true && false && true && true && true && false && false && true && false) {byte yisqvnbd = -2;}else{long hsyxbiux = -804762187;}
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