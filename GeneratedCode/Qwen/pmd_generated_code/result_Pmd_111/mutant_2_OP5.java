import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        
        // Introduced unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
                break;
        }
        
        return stringArray;
    }

    private boolean getCondition() {
        return false;
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