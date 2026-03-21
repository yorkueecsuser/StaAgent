import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        for  (int nyzmydcy = 0; nyzmydcy < 0; nyzmydcy++) {char qcrcpntu = 's';}
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