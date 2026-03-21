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
        int cjjnnvof = 0;switch  (cjjnnvof) {case 1:short ulsmztdm = -562;break;default:long ikknchkl = 807470493;break;}
        bar();
        return bar;
    
}
}