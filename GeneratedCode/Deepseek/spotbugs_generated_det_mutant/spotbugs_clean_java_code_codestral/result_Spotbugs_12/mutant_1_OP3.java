import org.easymock.EasyMock;

class UselessEasyMockCall {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)

        if (getFalseCondition()) {
            System.out.println("This code will never be executed.");
        }

        return 0;
    }
}