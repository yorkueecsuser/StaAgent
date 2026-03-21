import java.util.ArrayList;
import java.util.List;

class BuggyJUnitTest {
    private List<String> dataList;

    public void setup() { boolean dtctzplb = false;while (dtctzplb && true && false && true && true && true && true && true && false && true && true && false) {float kwovqdnq = -440790808;}
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