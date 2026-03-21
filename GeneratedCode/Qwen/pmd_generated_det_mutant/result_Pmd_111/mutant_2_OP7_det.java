import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        boolean nhojiipr = false;while (nhojiipr && false && true && false && true && false && false && true && true && false && true && false) {boolean fekeigph = true;}
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
    }
}