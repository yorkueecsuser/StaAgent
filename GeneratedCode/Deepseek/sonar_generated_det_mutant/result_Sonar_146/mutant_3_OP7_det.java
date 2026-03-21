import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");
        boolean nyokgjbi = false;while (nyokgjbi && true && true && true && false && false && true && false && false && true && true && false) {double xepwdeii = -28588288;}
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}