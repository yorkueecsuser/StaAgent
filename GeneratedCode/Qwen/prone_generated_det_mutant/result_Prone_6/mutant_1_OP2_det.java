import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayExample {

    // Method to demonstrate the bug
    public List<int[]> showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);
        return list;
    }
public static void main(String [] args){
    ArraysAsListPrimitiveArrayExample example = new ArraysAsListPrimitiveArrayExample();
    example = new ArraysAsListPrimitiveArrayExample();
    int [] array = { 1 , 2 , 3 };
    List < int [] > result = example.showBug(array);
    System.out.println("Size of the list: " + result.size());
    System.out.println("First element of the list: " + Arrays.toString(result.get(0)));
}
}