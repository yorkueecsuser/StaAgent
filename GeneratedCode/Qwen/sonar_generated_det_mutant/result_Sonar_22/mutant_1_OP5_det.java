import java.util.Collections;
import java.util.List;

class CollectionBugExample {

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
    }

    public static void main(String[] args) {
        int eoiglvoj = 0;switch  (eoiglvoj) {case 1:char ctrcpaym = 'x';break;default:long wealiwoc = 811750146;break;}
        CollectionBugExample example = new CollectionBugExample();
        try {
            example.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    
}
}