import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int x = 0; // Mutated: Renamed variable 'x' from its original name
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return x;
    }
}