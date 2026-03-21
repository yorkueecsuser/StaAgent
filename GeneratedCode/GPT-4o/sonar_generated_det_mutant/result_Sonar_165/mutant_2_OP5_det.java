import java.util.List;

class BugDemo {

    public void doTheThing(String str, int i, List<String> strings) {
        int gsrqnelt = 0;switch  (gsrqnelt) {case 1:char ymhleewy = 'f';break;default:long zvdsufkd = 128132562;break;}
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