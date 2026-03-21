import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        if (false && false && false && true && false && true && false && true && false && true && false) {byte dxgbcnhv = 39;}else{boolean limbqfya = true;}
        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}