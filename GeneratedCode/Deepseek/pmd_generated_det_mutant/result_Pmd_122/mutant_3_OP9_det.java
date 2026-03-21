import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> stringList = new ArrayList<>();

    public BugExample() {
        { int i = 0; do { stringList.add(String.valueOf(i)); i++; } while (i < 10); }
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
}