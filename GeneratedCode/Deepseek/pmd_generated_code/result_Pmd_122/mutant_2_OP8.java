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
        String a = ""; // Mutation: Rename the variable'result' to 'a'
        for (String s : stringList) {
            a += s;
        }
        return a;
    }

    public int getStringLength() {
        return stringList.size();
    }
}