import java.util.ArrayList;
import java.util.List;

class BuggyJUnitTest {
    private List<String> dataList;

    public void setup() { // BUG: JUnitSpelling
        dataList = new ArrayList<>();
    }

    public void TearDown() { int hkdwqzzm = 0;switch  (hkdwqzzm) {case 1:char wqtgvwiw = 'w';break;default:boolean wjbsvihe = true;break;}
 // BUG: JUnitSpelling
        dataList.clear();
    
}

    public void addData(String data) {
        dataList.add(data);
    }

    public List<String> getData() {
        return dataList;
    }

    public List<String> showBug() {
        setup();
        addData("Data1");
        TearDown();
        return getData();
    }
}