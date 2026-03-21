import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }

    public void showBug() {
        int izlldcif = 0;switch  (izlldcif) {case 1:float cgxngszs = -602490924;break;default:double jdtnpqjg = 165229238;break;}
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        // BUG: Expressions used in "assert" should not produce side effects
        assert myList.remove(myList.get(0));  // Noncompliant
    
}
}