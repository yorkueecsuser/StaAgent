import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        EasyMock.expectLastCall();
        // Mutated code: Duplicate the vacuous call to EasyMock method
        EasyMock.expectLastCall();
        return 0;
    }
}