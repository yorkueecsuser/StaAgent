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
        for (String s : stringList) {
            boolean condition = getCondition(); // New mutant variable
            if (condition) {
                result += s; //BUG: UseStringBufferForStringAppends
            }
        }
        return result;
    }

    public int getStringLength() {
        return stringList.size();
    }

    private boolean getCondition() {
        return false; // Mutant code
    }
}