import org.easymock.EasyMock;

class UselessEasyMockCall {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        EasyMock.expectLastCall();
        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        } else {
            // Always executed code
            System.out.println("This line is always executed.");
        }
        return 0;
    }
}