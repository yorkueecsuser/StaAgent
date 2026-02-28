import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        return stringArray;
    }

    public static void main(String[] args) {
        ArrayConversionExample example = new ArrayConversionExample();
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String[] result = example.showBug(list);
        for (String s : result) {
            System.out.println(s);
        }

        // Mutated code
        ArrayConversionExample exmpl = new ArrayConversionExample();
        List<String> lst = new ArrayList<>();
        lst.add("Hello");
        lst.add("World");
        String[] res = exmpl.showBug(lst);
        for (String t : res) {
            System.out.println(t);
        }
    }
}