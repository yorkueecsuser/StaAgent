import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int i = 0;
        do {
            EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
            i++;
        } while (i < 1); // This loop will run only once, as it is equivalent to having no loop at all
        return 0;
    }
}