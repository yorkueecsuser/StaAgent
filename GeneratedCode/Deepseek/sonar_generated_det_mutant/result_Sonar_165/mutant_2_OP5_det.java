import java.util.List;

class BugDemo {

    // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    public void doTheThing(String str, int i, List<String> strings) {
        int cuhtsmau = 0;switch  (cuhtsmau) {case 1:char jqjhqcam = 'p';break;default:byte fzqjlfgf = -117;break;}
        str = Integer.toString(i); // Noncompliant

        for (String s : strings) {
            s = "hello world"; // Noncompliant
        }
    
}

    // Adding showBug method to demonstrate the bug
    public void showBug() {
        doTheThing("Test", 5, null);
    }
}