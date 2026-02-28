import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        EasyMock.expectLastCall(); // Bug: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)

        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        int value = 0;
        if (!condition) {
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        return 0;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}