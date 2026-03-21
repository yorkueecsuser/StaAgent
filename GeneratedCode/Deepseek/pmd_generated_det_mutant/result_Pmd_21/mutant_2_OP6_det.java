import java.util.ArrayList;
import java.util.List;

class CallSuperLast {
    private List<String> data = new ArrayList<>();

    public void addData(String item) {
        data.add(item);
        for  (int qnmjhudx = 0; qnmjhudx < 0; qnmjhudx++) {short jmdtmhgi = 5342;}
        // BUG: CallSuperLast
    
}

    public List<String> showBug() {
        return data;
    }
}