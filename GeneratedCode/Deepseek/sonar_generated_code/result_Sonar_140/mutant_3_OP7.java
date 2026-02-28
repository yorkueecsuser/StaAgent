import java.util.Arrays;

class BugExample {
    private boolean conditionFor = true;
    private boolean conditionWhile = true;
    private boolean conditionIf = true;
    private boolean conditionSwitch = true;
    private int valueSwitch = 1;

    public int[] showBug() {
        int i = 0;
        int j = 0;

        // BUG: Values should not be uselessly incremented
        i = i++;

        // BUG: Values should not be uselessly incremented
        return new int[]{j++};
    }

    public void unreachableWhile() {
        // Unreachable while loop mutant
        while (conditionWhile) {
            System.out.println("This loop is unreachable");
        }
    }

    public void unreachableFor() {
        // Unreachable for loop mutant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    public void unreachableIf() {
        // Unreachable if statement mutant
        if (conditionIf) {
            System.out.println("This if statement is unreachable");
        } else {
            System.out.println("This else statement is unreachable");
        }
    }

    public void unreachableSwitch() {
        // Unreachable switch statement mutant
        switch (valueSwitch) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            case 1:
                System.out.println("This case is reachable");
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
        bugExample.unreachableWhile();
        bugExample.unreachableFor();
        bugExample.unreachableIf();
        bugExample.unreachableSwitch();
    }
}