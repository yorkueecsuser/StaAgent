import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        EasyMock.expectLastCall(); // Original bug

        // Mutant code added: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code will never be executed.");
        } else {
            return -1;
        }

        return 0;
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}