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
            for  (int vkoemqyu = 0; vkoemqyu < 0; vkoemqyu++) {boolean fcvvxtqj = false;}
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    public int getStringLength() {
        return stringList.size();
    }
}