import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strngs) {
        return (String []) strngs.toArray();
    }

    public void showBug() {
        List<String> strngs = Arrays.asList("one", "two", "three");
        String[] rslt = getStringArray(strngs);

        for (String str : rslt) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}