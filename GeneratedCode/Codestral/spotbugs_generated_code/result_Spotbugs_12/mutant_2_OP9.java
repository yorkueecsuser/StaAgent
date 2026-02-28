import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int counter = 0;
        do {
            EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
            counter++;
        } while (counter < 1);
        return 0;
    }
}