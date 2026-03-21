import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        if (false && true && false && true && true && true && false && true && true && false && false) {long pidqvyec = -300131000;}else{double jkzrvfic = 128716623;}
        System.out.println(myArray);
    
}
}