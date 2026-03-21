import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int a = 5; // Added a new variable and renamed it to 'a'
        EasyMock.expectLastCall(); // Original bug remains
        return a; // Return the new variable 'a'
    }
}