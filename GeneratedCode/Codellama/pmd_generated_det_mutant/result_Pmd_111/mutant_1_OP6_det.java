import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        for  (int zwtraolt = 0; zwtraolt < 0; zwtraolt++) {String frxxrxot = "yswxrknk";}
        System.out.println(myArray);
    
}
}