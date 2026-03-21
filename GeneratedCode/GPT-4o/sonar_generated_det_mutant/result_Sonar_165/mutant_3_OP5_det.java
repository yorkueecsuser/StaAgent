import java.util.List;

class BugDemo {

    public void doTheThing(String str, int i, List<String> strings) {
        int mxjnviha = 0;switch  (mxjnviha) {case 1:short vjqqozir = -9205;break;default:double fnravzje = 605479089;break;}
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