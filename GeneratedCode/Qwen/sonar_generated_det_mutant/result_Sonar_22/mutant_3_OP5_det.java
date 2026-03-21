import java.util.Collections;
import java.util.List;

class CollectionBugExample {

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
    }

    public static void main(String[] args) {
        int jintqjeb = 0;switch  (jintqjeb) {case 1:byte ifcauhnj = -112;break;default:short ixodtbgn = 5079;break;}
        CollectionBugExample example = new CollectionBugExample();
        try {
            example.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    
}
}