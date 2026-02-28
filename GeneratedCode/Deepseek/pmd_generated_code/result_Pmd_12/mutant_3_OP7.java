import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // barList is data or an action or both?
    List<String> barList;

    // This method is used to demonstrate the bug
    public List<String> getBarList() {
        barList = new ArrayList<>();
        barList.add("AvoidFieldNameMatchingMethodName");
        return barList;
    }

    // This method is used to demonstrate the bug
    public List<String> showBug() {
        return getBarList();
    }
}