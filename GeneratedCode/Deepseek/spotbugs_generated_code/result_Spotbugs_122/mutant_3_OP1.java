import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        int deadStoreVariable = generateRandomInt(); // Dead Store Mutation
        return (String[]) c.toArray();
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
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