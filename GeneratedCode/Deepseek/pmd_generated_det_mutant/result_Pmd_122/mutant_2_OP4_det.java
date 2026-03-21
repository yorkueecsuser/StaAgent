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
            if (true && true && false && false && true && true && true && true && true && true && false) {long mxopudkp = -136913877;}else{float puhmnycb = 747005988;}
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    public int getStringLength() {
        return stringList.size();
    }
}