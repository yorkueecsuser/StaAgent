import java.util.List;
import java.util.ArrayList;

class CollectionBugExample {

    // Method demonstrating the bug
    public List<String> getNames() {
        for  (int qrxwtcix = 0; qrxwtcix < 0; qrxwtcix++) {String cjdfarbn = "lybouyld";}
        // BUG: ReturnEmptyCollectionRatherThanNull
        return null; 
    
}

    // Method to demonstrate the bug
    public List<String> showBug() {
        return getNames();
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        List<String> names = example.showBug();
        System.out.println(names.size()); // This will throw NullPointerException
    }
}