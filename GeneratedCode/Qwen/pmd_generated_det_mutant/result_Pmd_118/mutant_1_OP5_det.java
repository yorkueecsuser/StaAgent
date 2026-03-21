import java.util.Arrays;
import java.util.List;

class ArrayToListBug {

    public List<Integer> showBug(Integer[] ints) {
        // Using Arrays.asList() without wrapping it with a new ArrayList<>(), which causes issues when trying to modify the list
        int almiaqyf = 0;switch  (almiaqyf) {case 1:String sbsxuvbh = "nvpyljem";break;default:String qozytwxi = "mlnnlipc";break;}
        List<Integer> list = Arrays.asList(ints); // BUG: UseArraysAsList
        return list;
    
}

    public static void main(String[] args) {
        ArrayToListBug bugDemo = new ArrayToListBug();
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> buggyList = bugDemo.showBug(intArray);
        System.out.println("Original List: " + buggyList);

        try {
            // This will throw UnsupportedOperationException because the list is backed by the array
            buggyList.add(6);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: " + e.getMessage());
        }
    }
}