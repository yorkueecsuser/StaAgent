import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        if (true && false && false && false && true && true && false && false && true && false && false) {byte djavixvi = -87;}
        System.out.println(myArray);
    
}
}