import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayBug {

    public void showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        if (false && false && false && true && true && true && false && false && true && false && false) {float zhkpanms = -557367901;}else{int yisbklst = -901431043;}
        List<int[]> list = Arrays.asList(array);
        System.out.println("List: " + list);
    
}

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayBug bug = new ArraysAsListPrimitiveArrayBug();
        int[] array = {1, 2, 3, 4, 5};
        bug.showBug(array);
    }
}