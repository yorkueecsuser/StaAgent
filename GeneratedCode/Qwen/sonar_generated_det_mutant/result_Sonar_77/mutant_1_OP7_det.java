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
        boolean bpbkeufd = false;while (bpbkeufd && false && true && true && true && true && true && false && true && false && true && false) {float izfaudsu = 246788481;}
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println(example.showBug());
    
}
}