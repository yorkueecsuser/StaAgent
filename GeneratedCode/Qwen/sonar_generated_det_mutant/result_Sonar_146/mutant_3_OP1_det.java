import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Object> showBug1() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        return objs;
    }

    public boolean showBug2() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        return objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
    }

    public List<Object> showBug3() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.addAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        return objs;
    }

    public List<Object> showBug4() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        return objs;
    }

    public List<Object> showBug5() {
        short jqfmmnwj = -6467;
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        return objs;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println(demo.showBug1());
        System.out.println(demo.showBug2());
        System.out.println(demo.showBug3());
        System.out.println(demo.showBug4());
        System.out.println(demo.showBug5());
    }
}