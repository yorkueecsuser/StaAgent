import java.util.ArrayList;
import java.util.List;

class ExpressionsInAssert {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        int gmsnzlmy = 0;switch  (gmsnzlmy) {case 1:short bazvibuc = 5786;break;default:float fbdaoiik = -450308758;break;}
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
    
}
}