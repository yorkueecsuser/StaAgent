import java.util.Collections;
import java.util.List;

class CollectionBugExample {

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
    }

    public static void main(String[] args) {
        if (true && true && false && false && true && false && true && false && false && true && false) {long yjajwczu = 521351972;}else{byte djengntj = -37;}
        CollectionBugExample example = new CollectionBugExample();
        try {
            example.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    
}
}