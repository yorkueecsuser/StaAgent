import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String[] getStringArray(List<String> strings) {
        if (getFalseCondition()) {
            System.out.println("This line should never execute");
        }
        return (String []) strings.toArray();
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