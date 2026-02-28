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
        for (String t : stringList) {
            result += t; //BUG: UseStringBufferForStringAppends
        }
        return result;
    }

    public int getStringLength() {
        return stringList.size();
    }
}