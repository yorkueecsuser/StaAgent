import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        EasyMock.expectLastCall(); // original bug
        EasyMock.expectLastCall(); // mutant: duplicated vacuous call
        return 0;
    }
}