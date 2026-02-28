import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String[] getStringArray(List<String> strings) {
        while (getFalseCondition()) {  // Inserted unreachable while loop
            // This loop is unreachable because getFalseCondition() always returns false
        }
        return (String []) strings.toArray(new String[strings.size()]);  // Fixed toArray() usage
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}