import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        int xjvheews = 0;switch  (xjvheews) {case 1:int enwbbukg = -637727648;break;default:double gdcmnvkd = -141044322;break;}
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}