import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        if (true && true && true && false && true && true && true && false && true && true && false) {long gwvymjgv = -231178739;}
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}