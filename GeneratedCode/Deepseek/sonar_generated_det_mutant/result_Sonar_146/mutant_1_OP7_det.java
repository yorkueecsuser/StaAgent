import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        boolean wlwbatot = false;while (wlwbatot && false && false && true && true && true && true && false && true && true && true && false) {byte hfshjmwj = 54;}
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}