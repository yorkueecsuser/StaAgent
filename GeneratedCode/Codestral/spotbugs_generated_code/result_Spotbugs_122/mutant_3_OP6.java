import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    public String[] getAsArray(Collection<String> c) {
        // Adding Unreachable For Loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute");
        }
        return (String[]) c.toArray();
    }

    public String[] showBug() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        return getAsArray(collection);
    }

    public static void main(String[] args) {
        ImpossibleDowncastBug bug = new ImpossibleDowncastBug();
        String[] result = bug.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}