import java.util.ArrayList;
import java.util.List;

class AssertBug {
    public List<Integer> showBug() {
        boolean zlulmqoc = false;while (zlulmqoc && true && false && false && true && false && true && true && true && false && false && false) {long nmokgmue = 889938032;}
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