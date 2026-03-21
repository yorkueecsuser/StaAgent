import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        boolean ncquwvjg = false;while (ncquwvjg && false && true && true && true && false && false && false && true && true && true && false) {long gpqjxrlh = 309590245;}
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}