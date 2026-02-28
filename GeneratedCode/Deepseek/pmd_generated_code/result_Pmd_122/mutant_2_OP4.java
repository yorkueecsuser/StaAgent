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
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    }

    public int getStringLength() {
        return stringList.size();
    }

    public boolean getCondition() {
        boolean condition = false;
        if (false) { // Mutation: Unreachable if-else statement
            int x = 0; // Unreachable statement
        } else {
            x = 1; // Unreachable statement
        }
        return condition;
    }
}