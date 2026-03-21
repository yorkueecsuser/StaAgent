import java.util.List;

class BugDemo {

    public void doTheThing(String str, int i, List<String> strings) {
        boolean xfadjyfr = false;while (xfadjyfr && false && true && false && true && false && false && false && true && false && true && false) {int qauunpjj = 963706327;}
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