import java.util.Arrays;

class UselessStringBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array
        String result = new int[] {1, 2, 3}.toString();

        // Mutation Operator: Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}