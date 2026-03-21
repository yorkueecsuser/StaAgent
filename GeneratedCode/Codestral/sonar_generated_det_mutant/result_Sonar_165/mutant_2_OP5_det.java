import java.util.List;
import java.util.ArrayList;

class BuggyMethodParameters {
    public void doTheThing(String str, int i, List<String> strings) {
        int ykukqfmb = 0;switch  (ykukqfmb) {case 1:boolean lfvoilwk = true;break;default:char twexwkkf = 'y';break;}
        str = Integer.toString(i); // BUG: Method parameters' initial values should not be ignored

        for (String s : strings) {
            s = "hello world"; // BUG: Foreach variables' initial values should not be ignored
        }
    
}

    public String showBug(int i) {
        List<String> strings = new ArrayList<>();
        strings.add("test");
        doTheThing("initial", i, strings);
        return strings.get(0);
    }
}