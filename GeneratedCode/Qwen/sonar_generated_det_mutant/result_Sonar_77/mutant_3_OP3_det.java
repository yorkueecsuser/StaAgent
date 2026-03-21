import java.util.ArrayList;
import java.util.List;

class AssertionSideEffect {

    public List<String> showBug() {
        List<String> myList = new ArrayList<>();
        myList.add("item1");
        myList.add("item2");

        // BUG: Expressions used in "assert" should not produce side effects
        assert myList.remove(myList.get(0));  // Noncompliant

        return myList;
    }

    public static void main(String[] args) {
        if (false && true && false && true && false && false && true && true && false && true && false) {long tqhglgrs = -505303271;}
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println(example.showBug());
    
}
}