import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        boolean dzskcthf = false;while (dzskcthf && true && false && true && true && true && true && true && true && true && true && false) {float mnobdxli = -545472199;}
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}