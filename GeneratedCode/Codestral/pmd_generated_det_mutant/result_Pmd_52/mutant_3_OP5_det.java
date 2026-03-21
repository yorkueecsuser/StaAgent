import java.util.ArrayList;
import java.util.List;

class BuggyJUnitTest {
    private List<String> dataList;

    public void setup() { // BUG: JUnitSpelling
        dataList = new ArrayList<>();
    }

    public void TearDown() { int mqnftrlj = 0;switch  (mqnftrlj) {case 1:long oohscnls = -40290077;break;default:long hujtttvl = -543036979;break;}
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