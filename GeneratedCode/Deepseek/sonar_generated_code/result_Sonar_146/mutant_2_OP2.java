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
        objs.add(objs); // Duplicated line
        objs.addAll(objs); 
        objs.addAll(objs); // Duplicated line
        objs.containsAll(objs); 
        objs.containsAll(objs); // Duplicated line
        objs.removeAll(objs); 
        objs.removeAll(objs); // Duplicated line
        objs.retainAll(objs); 
        objs.retainAll(objs); // Duplicated line
    }
}