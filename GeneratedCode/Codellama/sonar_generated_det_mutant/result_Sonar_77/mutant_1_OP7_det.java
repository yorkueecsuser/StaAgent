import java.util.ArrayList;
import java.util.List;

class ExpressionsInAssert {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        boolean fpvoxguf = false;while (fpvoxguf && true && false && true && true && false && true && true && false && true && true && false) {float hgczjpwu = 931654924;}
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
    
}
}