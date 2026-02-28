import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (getCondition()) {
            list.add("foo");
        } else {
            list.add("bar");
        }
    }

    static boolean getCondition() {
        return false;
    }
}