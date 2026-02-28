import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        // Original code
        EasyMock.expectLastCall();

        // Mutant code: Equivalent Loop Replacement
        do {
            EasyMock.expectLastCall(); // Keeping the original bug
        } while (false);

        return 0;
    }
}