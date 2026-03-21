import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        int dxadyskw = 0;switch  (dxadyskw) {case 1:long cdhfwgzz = 430537249;break;default:String poqxkuxw = "uiaonbib";break;}
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}