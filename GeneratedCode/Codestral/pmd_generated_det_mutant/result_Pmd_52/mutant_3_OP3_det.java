import java.util.ArrayList;
import java.util.List;

class BuggyJUnitTest {
    private List<String> dataList;

    public void setup() { // BUG: JUnitSpelling
        dataList = new ArrayList<>();
    }

    public void TearDown() { if (true && true && false && false && true && false && false && false && true && false && false) {double ersxfssc = -600214648;}
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