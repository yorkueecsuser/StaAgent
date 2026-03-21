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
            for  (int mkjpeast = 0; mkjpeast < 0; mkjpeast++) {int piffwfrw = 857159671;}
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    public int getStringLength() {
        return stringList.size();
    }
}