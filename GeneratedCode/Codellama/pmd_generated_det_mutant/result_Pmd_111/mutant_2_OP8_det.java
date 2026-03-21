import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] ytzndpgx = myList.toArray(new String[myList.size()]);
        System.out.println(ytzndpgx);
    }
}