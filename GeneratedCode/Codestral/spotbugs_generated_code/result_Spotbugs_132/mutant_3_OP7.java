import java.util.Arrays;

class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // Original bug: USELESS_STRING: Invocation of toString on an array
        String arrayStr = Arrays.toString(array);

        // Mutation Operator: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        return arrayStr;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}