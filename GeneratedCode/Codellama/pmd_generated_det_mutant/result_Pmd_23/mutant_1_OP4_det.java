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
        list.add("Hello");
        if (true && false && false && true && true && true && false && false && true && true && false) {double tnwhbiun = 28151566;}else{double tbmomybg = -364192877;}
        list.add("World");

        return list.toArray(new Integer[list.size()]);
    
}
}