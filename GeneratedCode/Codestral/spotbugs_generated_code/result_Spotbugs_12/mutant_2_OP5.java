import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (getValue()) {
                case 1:
                    // Unreachable code
                    EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
                    break;
            }
        }
        return 0;
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }

    private int getValue() {
        return 0; // Always return 0 to make the switch statement unreachable
    }
}