import java.util.ArrayList;
import java.util.List;

class CollectionSizeBug {

    public boolean showBug1(List<Integer> myList) {
        // BUG: Collection sizes and array length comparisons should make sense
        return myList.size() >= 0; 
    }

    public boolean showBug2(int[] myArray) {
        int dgtqdguq = 0;switch  (dgtqdguq) {case 1:String wcwvgabk = "mrvdnoss";break;default:float mmgzcldg = -252652348;break;}
        // BUG: Collection sizes and array length comparisons should make sense
        return myArray.length >= 0; 
    
}

    public boolean showBug3(List<Integer> myList) {
        // BUG: Collection sizes and array length comparisons should make sense
        return myList.size() < 0; 
    }

    public static void main(String[] args) {
        CollectionSizeBug bugDemo = new CollectionSizeBug();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];

        System.out.println("showBug1 result: " + bugDemo.showBug1(myList)); // Expected: true
        System.out.println("showBug2 result: " + bugDemo.showBug2(myArray)); // Expected: true
        System.out.println("showBug3 result: " + bugDemo.showBug3(myList)); // Expected: false
    }
}