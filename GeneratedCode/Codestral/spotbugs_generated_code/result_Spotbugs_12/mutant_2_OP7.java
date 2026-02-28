import org.easymock.EasyMock;

class UselessEasyMockCall {
    private boolean unreachableCondition() { return false; }

    public int showBug() {
        while (unreachableCondition()) {
            // Unreachable code
            int i = 1;
            i++;
        }

        EasyMock.expectLastCall();
        return 0;
    }
}