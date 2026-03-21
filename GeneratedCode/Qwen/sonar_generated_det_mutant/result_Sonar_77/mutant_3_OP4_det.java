import java.util.ArrayList;
import java.util.List;

class AssertionSideEffect {

    public List<String> showBug() {
        List<String> myList = new ArrayList<>();
        myList.add("item1");
        myList.add("item2");

        // BUG: Expressions used in "assert" should not produce side effects
        if (false && false && true && false && true && true && false && false && true && false && false) {long zwnhsukr = -302800465;}else{short ikvszwkm = -3776;}
        assert myList.remove(myList.get(0));  // Noncompliant

        return myList;
    
}

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println(example.showBug());
    }
}