import java.util.ArrayList;
import java.util.List;

class ExpressionsInAssert {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        int protqrnl = 0;switch  (protqrnl) {case 1:float pcshcryz = 348772688;break;default:byte rjnkawbf = 13;break;}
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
    
}
}