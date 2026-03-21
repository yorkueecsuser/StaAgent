import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        boolean aivssxte = false;while (aivssxte && true && false && false && true && true && true && false && false && false && false && false) {double zckmooho = 122873364;}
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