import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        while (getFalseCondition()) { // Mutant: Unreachable while loop
            // Empty loop body
        }
        EasyMock.expectLastCall(); // Original bug: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    }

    private boolean getFalseCondition() {
        return false;
    }
}