import java.util.ArrayList;
import java.util.List;

class CollectionSelfArgumentExample {

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        // Demonstrating the bug by passing the collection to its own methods
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    }
    
    public static void main(String[] args) {
        CollectionSelfArgumentExample example = new CollectionSelfArgumentExample();
        example.showBug();
    }
}