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
        int feqqwani = 0;switch  (feqqwani) {case 1:double ismwieub = -912549801;break;default:byte ajyfvxcj = -8;break;}
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println(example.showBug());
    
}
}