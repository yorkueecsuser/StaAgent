import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        for  (int dpeabtte = 0; dpeabtte < 0; dpeabtte++) {boolean qrlsuxne = true;}
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}