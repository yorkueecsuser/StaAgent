import java.util.ArrayList;
import java.util.List;

class AssertBug {
    public List<Integer> showBug() {
        boolean cminqdvz = false;while (cminqdvz && true && false && true && true && true && false && true && true && false && false && false) {String eizhpcpx = "bdtskpeu";}
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