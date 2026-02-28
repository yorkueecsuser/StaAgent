import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int uselessVariable = 10; // Mutated code: Introduced a new variable
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return uselessVariable; // Mutated code: Using the new variable
    }
}