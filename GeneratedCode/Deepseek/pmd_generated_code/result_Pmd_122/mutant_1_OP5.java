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

    public void mutantUnreachableSwitch() {
        boolean unreachable = false;
        if (unreachable) {
            int switchValue = 0; // This will never be executed due to the unreachable condition
            switch (switchValue) {
                case 0:
                    System.out.println("This line will never be executed");
                    break;
                default:
                    break;
            }
        }
    }
}