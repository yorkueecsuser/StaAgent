import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        int ocrebzct = 0;switch  (ocrebzct) {case 1:String qtjqzrjc = "dyxhartr";break;default:double suyyzyiq = -11222666;break;}
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}