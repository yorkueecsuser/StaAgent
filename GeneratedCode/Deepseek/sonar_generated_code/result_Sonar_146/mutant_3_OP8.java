import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showMutantBug();
    }

    public void showMutantBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // RENAMED Mutant
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // RENAMED Mutant
        // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // RENAMED Mutant
        // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // RENAMED Mutant
        // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // RENAMED Mutant
        // BUG: Collections should not be passed as arguments to their own methods
    }
}