import java.util.ArrayList;
import java.util.List;

class CollectionAndArraySizeBug {
public boolean showBug(List < ? > myList , int [] myArray){
    if(myList.size() >= 0){ System.out.println("List size is non-negative."); }
    boolean result = myArray.length >= 0;
    result = myArray.length >= 0;
    System.out.println("Array length is non-negative: " + result);
    if(myList.size() < 0){ System.out.println("This will never print."); }
    return result;
}

    public static void main(String[] args) {
        CollectionAndArraySizeBug bugDemo = new CollectionAndArraySizeBug();
        List<String> list = new ArrayList<>();
        int[] array = new int[10];
        bugDemo.showBug(list, array);
    }
}