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
        String res = "";
        for (String s : stringList) {
            res += s; //Mutant: Renaming -> Use a different variable name for result
        }
        return res;
    }

    public int getStringLength() {
        return stringList.size();
    }
}