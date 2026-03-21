import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        for  (int olxhjxmb = 0; olxhjxmb < 0; olxhjxmb++) {char dxtovvii = 'g';}
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
    
}

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return bar;
    }
}