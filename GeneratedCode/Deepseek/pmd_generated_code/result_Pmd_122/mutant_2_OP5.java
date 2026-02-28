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
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    }

    public int getStringLength() {
        int stringLength = 0;
        stringLength = getStringList().size();
        switch(stringLength) {
            case 10:
                String newString;
                break;
            case 20:
                newString = "Hello";
                break;
            case 30:
                newString = "World";
                break;
            default:
                newString = "Default";
                break;
        }
        return stringList.size();
    }

    public List<String> getStringList() {
        return stringList;
    }
}