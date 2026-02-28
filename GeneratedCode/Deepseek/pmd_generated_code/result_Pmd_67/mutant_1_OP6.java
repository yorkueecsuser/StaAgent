import java.util.Arrays;

class Example {
    // Not a good idea...
    public int[] badBehavior() {
        //...
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    // Good behavior
    public String[] goodBehavior() {
        //...
        return new String[0];
    }

    public int[] showBug() {
        return badBehavior();
    }

    // Unreachable loop mutation
    public boolean getCondition() {
        return false;
    }

    public void unreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Do nothing, this is an unreachable loop
        }
    }

    public static void main(String[] args) {
        Example example = new Example();
        int[] result = example.showBug();
        System.out.println(Arrays.toString(result)); // This will throw NullPointerException
        
        // Unreachable loop mutation
        example.unreachableLoop();
    }
}