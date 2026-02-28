import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int deadStoreVariable; // Added dead store variable
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    }
}