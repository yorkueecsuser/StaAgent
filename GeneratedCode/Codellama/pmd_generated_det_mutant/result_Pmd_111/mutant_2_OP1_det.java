import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        byte nvijpveh = 50;
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}