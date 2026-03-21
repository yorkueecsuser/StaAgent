import java.util.ArrayList;
import java.util.List;

class ExpressionsInAssert {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        if (true && false && false && false && true && true && false && false && true && false && false) {int tewtjcza = -76472013;}else{String evtxsflq = "mmsmnnwa";}
        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects
    
}
}