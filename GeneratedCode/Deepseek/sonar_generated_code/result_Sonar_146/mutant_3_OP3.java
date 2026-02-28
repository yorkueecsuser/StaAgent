import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        if (false) {
            objs.add(objs); 
        }
        if (false) {
            objs.addAll(objs); 
        }
        if (false) {
            objs.containsAll(objs); 
        }
        if (false) {
            objs.removeAll(objs); 
        }
        if (false) {
            objs.retainAll(objs); 
        }

        boolean condition = false;
        if (condition) {
            objs.add(objs); 
        } else {
            objs.addAll(objs); 
        }

        condition = false;
        if (condition) {
            objs.containsAll(objs); 
        } else {
            objs.removeAll(objs); 
        }

        condition = false;
        if (condition) {
            objs.removeAll(objs); 
        } else {
            objs.retainAll(objs); 
        }
    }
}