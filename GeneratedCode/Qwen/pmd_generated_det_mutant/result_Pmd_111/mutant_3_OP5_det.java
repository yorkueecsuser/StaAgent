import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        int xznnfokc = 0;switch  (xznnfokc) {case 1:String ufpvpjrv = "qmaxvznv";break;default:boolean xfrplsnw = true;break;}
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