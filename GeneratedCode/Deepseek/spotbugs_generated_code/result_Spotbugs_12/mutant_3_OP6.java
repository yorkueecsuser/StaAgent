import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean shouldRun = getCondition(); // Adding a method call to make the condition dynamic
        for (int i = 0; shouldRun; i++) { // Unreachable for loop
            // This loop will never execute as `shouldRun` is always false
        }
        EasyMock.expectLastCall(); // Original bug still present
        return 0;
    }

    private boolean getCondition() {
        return false; // The method always returns false, making the loop unreachable
    }
}