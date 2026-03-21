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
        String urysdmhc = "";
        for (String s : stringList) {
            urysdmhc += s; //BUG: UseStringBufferForStringAppends
        }
        return urysdmhc;
    }

    public int getStringLength() {
        return stringList.size();
    }
}