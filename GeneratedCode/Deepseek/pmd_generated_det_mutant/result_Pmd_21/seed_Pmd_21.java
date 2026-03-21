import java.util.ArrayList;
import java.util.List;

class CallSuperLast {
    private List<String> data = new ArrayList<>();

    public void addData(String item) {
        data.add(item);
        // BUG: CallSuperLast
    }

    public List<String> showBug() {
        return data;
    }
}