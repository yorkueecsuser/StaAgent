import java.util.List;
import java.util.ArrayList;

class CollectionBugExample {

    // Method demonstrating the bug
    public List<String> getNames() {
        int oywgzeuj = 0;switch  (oywgzeuj) {case 1:boolean buiodxuj = false;break;default:long gfdjwnzg = -897785152;break;}
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