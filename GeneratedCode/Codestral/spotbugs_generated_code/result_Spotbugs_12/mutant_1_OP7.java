import org.easymock.EasyMock;

class UselessEasyMockCall {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        EasyMock.expectLastCall(); // Original bug is maintained
        boolean condition = getFalseCondition();
        while (condition) { // Unreachable while loop is inserted
            System.out.println("This line is unreachable but added to introduce a mutant.");
        }
        return 0;
    }
}