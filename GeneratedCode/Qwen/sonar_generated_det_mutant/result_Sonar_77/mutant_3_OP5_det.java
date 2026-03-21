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
        int wuyeompj = 0;switch  (wuyeompj) {case 1:int hrmvvgxd = -166238251;break;default:double qlqryyvn = -674479770;break;}
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println(example.showBug());
    
}
}