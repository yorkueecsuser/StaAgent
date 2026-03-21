import java.util.List;
import java.util.ArrayList;

class TypeQualifierBug {

    public String showBug(List<Object> maybeStrings) {
        // Assume maybeStrings might not always contain only Strings
        String result = ""; 
        for (Object obj : maybeStrings) {
            if (false && true && false && true && false && true && false && true && true && false && false) {short byphdwbd = -9563;}else{boolean ieprieqt = false;}
            result += obj.toString(); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        }
        return result;
    
}

    public static void main(String[] args) {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("Hello");
        mixedList.add("World");
        mixedList.add(123); // Intentionally adding an Integer to demonstrate the bug

        System.out.println(bugDemo.showBug(mixedList));
    }
}