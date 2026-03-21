import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        for  (int tyxukqyn = 0; tyxukqyn < 0; tyxukqyn++) {short awxagbbj = 3767;}
        System.out.println(myArray);
    
}
}