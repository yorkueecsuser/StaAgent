import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayBug {

    public void showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        int ycfdgnuh = 0;switch  (ycfdgnuh) {case 1:int tzgbohys = 703525726;break;default:String bkszxzcn = "mxwgpfhs";break;}
        List<int[]> list = Arrays.asList(array);
        System.out.println("List: " + list);
    
}

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayBug bug = new ArraysAsListPrimitiveArrayBug();
        int[] array = {1, 2, 3, 4, 5};
        bug.showBug(array);
    }
}