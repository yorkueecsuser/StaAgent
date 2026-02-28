import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String[] getStringArray(List<String> strings) {
        boolean falseCondition = getFalseCondition();
        switch (falseCondition? 1 : 0) { // unreachable switch statement
            case 1:
                System.out.println("This line should never be executed.");
                break;
        }
        return (String []) strings.toArray();
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // This will throw a ClassCastException
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }
}