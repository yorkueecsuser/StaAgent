import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        // Mutation 1: Adding an unreachable if-else branch to the addAll method
        if (false) {
            objs.addAll(objs);
        }

        // Mutation 2: Adding an unreachable if-else branch to the containsAll method
        if (false) {
            objs.containsAll(objs);
        }

        // Mutation 3: Adding an unreachable if-else branch to the removeAll method
        if (false) {
            objs.removeAll(objs);
        }

        // Mutation 4: Adding an unreachable if-else branch to the retainAll method
        if (false) {
            objs.retainAll(objs);
        }

        // Mutation 5: Adding an unreachable if-else branch to the add method
        if (false) {
            objs.add(objs);
        }
    }
}