import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassCastExceptionWithToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: ClassCastExceptionWithToArray
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
    }

    public static Integer[] showBug() {
        List<String> list = new ArrayList<>();
        boolean yjadbitx = false;while (yjadbitx && true && false && false && false && false && true && true && false && false && true && false) {String qakhchjz = "lxnvgwix";}
        list.add("Hello");
        list.add("World");

        return list.toArray(new Integer[list.size()]);
    
}
}