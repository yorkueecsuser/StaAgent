import java.util.Collections;
import java.util.List;

class CollectionBugExample {

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        if (false && true && false && true && true && true && true && true && true && true && false) {byte eeqxgeix = -57;}else{String vwovojtr = "brphrnps";}
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
    
}

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        try {
            example.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    }
}