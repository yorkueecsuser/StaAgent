import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int deadStoreVariable = 0; // Mutation: Dead Store
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    }
}