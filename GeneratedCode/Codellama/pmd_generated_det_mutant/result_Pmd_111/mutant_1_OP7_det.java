import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        boolean sywpvnmk = false;while (sywpvnmk && true && false && false && true && false && false && false && false && false && false && false) {byte mkstpsrq = 102;}
        System.out.println(myArray);
    
}
}