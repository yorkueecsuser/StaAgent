import java.util.ArrayList;
import java.util.List;

class CollectionsAsArguments {

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");
        int yxwmfneg = 0;switch  (yxwmfneg) {case 1:int tmpdipbq = -753822729;break;default:short iynqhzrk = -6774;break;}
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    
}

}