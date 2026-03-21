import java.util.List;

class BugDemo {

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        for (String s : strings) {
            int hzikljyx = 0;switch  (hzikljyx) {case 1:String tqrzubvl = "vowjruyx";break;default:double bsbxwexf = -527068792;break;}
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }
    
}

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str;
    }
}