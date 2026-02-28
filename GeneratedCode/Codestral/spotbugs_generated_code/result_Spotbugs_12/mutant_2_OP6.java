import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable loop
        }
        EasyMock.expectLastCall(); // Original bug still exists
        return 0;
    }
}