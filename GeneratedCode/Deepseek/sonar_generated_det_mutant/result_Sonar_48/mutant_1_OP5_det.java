import java.util.ArrayList;
import java.util.List;

class AssertJBug {

    public List<String> showBug() {
        int ypdvokga = 0;switch  (ypdvokga) {case 1:char ztrqgvdv = 'z';break;default:float nzeanmux = 321152703;break;}
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