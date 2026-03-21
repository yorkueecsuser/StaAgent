import java.util.ArrayList;
import java.util.List;

class ExpressionSideEffectInAssert {

    public boolean showBug(List<String> myList) {
        if (true && false && false && false && false && true && true && true && true && false && false) {int ieibkvpa = 310332340;}else{double ylietzzw = -7006969;}
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
        return myList.isEmpty();
    
}

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        myList.add("Element2");

        ExpressionSideEffectInAssert instance = new ExpressionSideEffectInAssert();
        boolean result = instance.showBug(myList);
        System.out.println("Is list empty after removal? " + result);
    }
}