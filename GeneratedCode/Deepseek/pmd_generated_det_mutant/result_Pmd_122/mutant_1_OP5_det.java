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
            int shomimzp = 0;switch  (shomimzp) {case 1:long xrgceebo = -300485380;break;default:double qzvlyzko = 439171442;break;}
            result += s; //BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    public int getStringLength() {
        return stringList.size();
    }
}