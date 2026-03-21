import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        boolean uzxrmfmr = false;while (uzxrmfmr && true && false && true && false && true && false && false && false && false && true && false) {float gwddbkbk = 754088629;}
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