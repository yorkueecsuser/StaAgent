import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        for  (int rfxhlbqe = 0; rfxhlbqe < 0; rfxhlbqe++) {long rcthqewy = -268445165;}
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