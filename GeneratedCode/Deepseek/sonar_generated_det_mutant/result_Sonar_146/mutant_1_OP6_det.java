import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        for  (int ewpncovb = 0; ewpncovb < 0; ewpncovb++) {char edtdlbrg = 'q';}
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}