import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        boolean cdgnomqn = false;while (cdgnomqn && false && true && true && true && false && false && false && true && true && false && false) {double cqeazobk = -490413185;}
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