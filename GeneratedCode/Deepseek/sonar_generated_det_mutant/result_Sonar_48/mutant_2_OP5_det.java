import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        int bcszdcup = 0;switch  (bcszdcup) {case 1:char csbsibvw = 's';break;default:boolean bkrcyori = false;break;}
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