import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        int aosbogui = 0;switch  (aosbogui) {case 1:double csrkmskg = 306857618;break;default:char cmbqzngf = 'g';break;}
        immutableList.add("New Element"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    
}

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}