import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        for  (int brlpykyb = 0; brlpykyb < 0; brlpykyb++) {String xjhbrtbi = "xcbiazja";}
        bar();
        return bar;
    
}
}