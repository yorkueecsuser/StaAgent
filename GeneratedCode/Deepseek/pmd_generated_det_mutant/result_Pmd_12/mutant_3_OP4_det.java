import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        if (false && true && true && false && true && true && true && false && false && true && false) {String kxwwqukt = "wxvhcbfp";}else{short yigpfnys = 945;}
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