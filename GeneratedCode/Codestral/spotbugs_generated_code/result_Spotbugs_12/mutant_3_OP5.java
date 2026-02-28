import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean condition = false;
        if (condition) {
            int value = getSomeValue();
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    // do nothing
            }
        }
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    }

    private int getSomeValue() {
        return 0; // this method will always return 0
    }
}