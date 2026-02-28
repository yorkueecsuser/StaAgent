import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return (String []) strings.toArray();
    }

    public void showBug() {
        List<String> strs = Arrays.asList("one", "two", "three");  // Mutant: Renamed'strings' to'strs'
        String[] result = getStringArray(strs);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}