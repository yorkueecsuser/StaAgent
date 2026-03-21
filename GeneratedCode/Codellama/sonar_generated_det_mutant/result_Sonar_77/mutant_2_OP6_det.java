import java.util.ArrayList;
import java.util.List;

class ExpressionsInAssert {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        for  (int orbhffjj = 0; orbhffjj < 0; orbhffjj++) {long hxpxrkvl = -465852221;}
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
    
}
}