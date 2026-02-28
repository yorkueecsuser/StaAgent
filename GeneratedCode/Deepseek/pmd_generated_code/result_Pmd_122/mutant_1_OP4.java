import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> stringList = new ArrayList<>();

    public BugExample() {
        for (int i = 0; i < 10; i++) {
            stringList.add(String.valueOf(i));
        }
    }

    public String showBug() {
        String result = "";
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code block is unreachable but it's here to make the if-else statement mutation valid.
            result += "Unreachable code";
        } else {
            for (String s : stringList) {
                result += s; //BUG: UseStringBufferForStringAppends
            }
        }
        return result;
    }

    public int getStringLength() {
        return stringList.size();
    }
}