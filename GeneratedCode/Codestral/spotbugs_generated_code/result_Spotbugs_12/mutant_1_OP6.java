import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is false
        }
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    }

    private boolean getCondition() {
        return false;
    }
}