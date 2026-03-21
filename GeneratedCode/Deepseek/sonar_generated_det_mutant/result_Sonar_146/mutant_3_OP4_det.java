import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        if (true && false && false && false && false && false && true && true && true && true && false) {short aibkrjyf = -6633;}else{int ywpihrth = -190604669;}
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}