import java.util.List;
import java.util.ArrayList;

class TypeQualifierBug {
public String showBug(List < Object > maybeStrings){
    String result = "";
    result = "";
    for(Object obj : maybeStrings){ result += obj.toString(); }
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