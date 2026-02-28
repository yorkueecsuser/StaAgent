import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    // Newly added mutant code: ArrayIndexOutOfBoundsException may be thrown
    public String[] getAsArray(Collection<String> c) {
        String[] array = (String[]) c.toArray();
        String[] duplicateArray = array; // Duplicating the assignment
        return duplicateArray[array.length]; // Accessing out of bounds index
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