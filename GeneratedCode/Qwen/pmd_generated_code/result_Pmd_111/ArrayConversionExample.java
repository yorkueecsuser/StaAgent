import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        return stringArray;
    }

    // Mutant code with Renaming mutation operator
    public String[] showBugMutant(List<String> x) {
        // BUG: OptimizableToArrayCall
        String[] y = x.toArray(new String[x.size()]);
        return y;
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

        // Testing mutant method
        String[] mutantResult = example.showBugMutant(list);
        for (String s : mutantResult) {
            System.out.println(s);
        }
    }
}