import java.util.ArrayList;
import java.util.List;

class AssertionSideEffect {

    public List<String> showBug() {
        List<String> myList = new ArrayList<>();
        myList.add("item1");
        myList.add("item2");

        // BUG: Expressions used in "assert" should not produce side effects
        if (false && false && true && true && true && true && false && false && true && false && false) {int zfinwphq = 595746242;}else{int pavugoff = -470179269;}
        assert myList.remove(myList.get(0));  // Noncompliant

        return myList;
    
}

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println(example.showBug());
    }
}