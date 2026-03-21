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
            for  (int bgclcmcv = 0; bgclcmcv < 0; bgclcmcv++) {double hnihjsew = -316348509;}
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    public int getStringLength() {
        return stringList.size();
    }
}