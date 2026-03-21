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
        String qwlcujlp = "";
        for (String s : stringList) {
            qwlcujlp += s; //BUG: UseStringBufferForStringAppends
        }
        return qwlcujlp;
    }

    public int getStringLength() {
        return stringList.size();
    }
}