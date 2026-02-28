import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        return (String []) strings.toArray();
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public void unreachableSwitchStatement() {
        boolean isFalse = false;
        switch (isFalse) {
            case true:
                // This case will never be reached
                System.out.println("This is an unreachable case.");
                break;
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
        bug.unreachableSwitchStatement();
    }
}