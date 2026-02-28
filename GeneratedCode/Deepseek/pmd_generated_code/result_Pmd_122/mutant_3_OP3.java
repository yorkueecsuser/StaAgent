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
            result += s;
        }
        if(false) {
            // Unreachable code
            result += "This is unreachable code.";
        }
        return result;
    }

    public int getStringLength() {
        return stringList.size();
    }
}