import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        EasyMock.expectLastCall(); // Original buggy line
        EasyMock.expectLastCall(); // Mutated line: Duplicated buggy line
        return 0;
    }
}