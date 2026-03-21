import java.util.ArrayList;
import java.util.List;

class AssertBug {
    public List<Integer> showBug() {
        int vufozdzm = 0;switch  (vufozdzm) {case 1:short ihmlaqlj = -1553;break;default:byte rsqjflcx = -55;break;}
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        assert myList.remove(myList.get(0));  // Noncompliant: Bug is here, side effect in assert statement
        return myList;
    
}

    public static void main(String[] args) {
        AssertBug bug = new AssertBug();
        System.out.println(bug.showBug());
    }
}