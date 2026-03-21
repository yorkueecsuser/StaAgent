import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        int nkhaxrhf = 0;switch  (nkhaxrhf) {case 1:byte qwnzpoix = 73;break;default:byte vyokkwxf = -128;break;}
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}