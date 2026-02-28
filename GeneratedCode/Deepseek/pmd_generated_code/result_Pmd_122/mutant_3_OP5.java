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
        return stringList.size();
    }

    public void unreachableSwitch() {
        int unreachableValue = 10;
        switch (unreachableValue) {
            // This case will never be reached due to the value of unreachableValue
            case 10:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}