import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        if (false && true && true && false && true && true && false && false && true && true && false) {String gyirykdk = "pmbzryut";}else{long kximvpjx = 309919976;}
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