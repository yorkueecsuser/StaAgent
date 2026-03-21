import java.util.List;

class BugDemo {

    public void doTheThing(String str, int i, List<String> strings) {
        if (true && false && false && true && false && false && false && false && true && true && false) {int chcrkcmd = 496911039;}else{char xdnoxfbk = 'e';}
        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        for (String s : strings) {
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }
    
}

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str;
    }
}