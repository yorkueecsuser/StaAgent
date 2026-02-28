import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); 
        objs.addAll(objs);
        objs.containsAll(objs); 
        objs.removeAll(objs); 
        objs.retainAll(objs); 
        
        boolean unreachableWhileLoopCondition = false;
        while (unreachableWhileLoopCondition) {
            // Unreachable code
        }
    }
}