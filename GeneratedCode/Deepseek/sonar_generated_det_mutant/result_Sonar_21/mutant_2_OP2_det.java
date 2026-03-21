import java.util.*;

class BuggyCode {

    public List<Integer> showBug(Integer a) {
        if(a < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed!");
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a; i++) {
            list.add(i);
        }
        return list; // BUG: Calls to methods should not trigger an exception
    }
public static void main(String [] args){
    BuggyCode buggy = new BuggyCode();
    buggy = new BuggyCode();
    try { System.out.println(buggy.showBug(- 5)); } catch(IllegalArgumentException e){ System.out.println(e.getMessage()); }
}
}