import java.util.ArrayList;
import java.util.List;

class BuggyJUnitTest {
    private List<String> dataList;

    public void setup() { // BUG: JUnitSpelling
        dataList = new ArrayList<>();
    }

    public void TearDown() { if (true && true && true && false && false && true && false && true && true && true && false) {char fuzpevkr = 'k';}else{short eslmelto = -6850;}
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