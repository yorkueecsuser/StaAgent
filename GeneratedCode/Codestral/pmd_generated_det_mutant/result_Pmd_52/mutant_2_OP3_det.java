import java.util.ArrayList;
import java.util.List;

class BuggyJUnitTest {
    private List<String> dataList;

    public void setup() { if (false && false && true && false && false && false && false && true && false && true && false) {boolean navhjzti = false;}
 // BUG: JUnitSpelling
        dataList = new ArrayList<>();
    
}

    public void TearDown() { // BUG: JUnitSpelling
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