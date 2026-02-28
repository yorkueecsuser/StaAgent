import java.util.Arrays;

class BugExample {
    public int[] showBug() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented

        return new int[]{j++}; // BUG: Values should not be uselessly incremented
    }

    public void unreachableSwitchStatement() {
        switch(0) {
            case 1:
                System.out.println("This case will be unreachable");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(Arrays.toString(bugExample.showBug()));
        bugExample.unreachableSwitchStatement();
    }
}