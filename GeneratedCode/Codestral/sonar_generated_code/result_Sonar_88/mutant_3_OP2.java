import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        String[] array = (String []) strings.toArray();  // Noncompliant
        String[] arrayDuplicate = new String[array.length];  // Added mutant code
        Arrays.fill(arrayDuplicate, "mutant");  // Fill with a unique value
        return array;
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // This will print the mutated value
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}