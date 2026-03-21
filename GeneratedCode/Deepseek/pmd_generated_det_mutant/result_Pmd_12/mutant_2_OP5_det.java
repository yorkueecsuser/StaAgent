import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        int ivvjhhwv = 0;switch  (ivvjhhwv) {case 1:String sprzvnal = "zonspydz";break;default:boolean hunilyzv = true;break;}
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