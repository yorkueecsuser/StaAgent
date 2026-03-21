import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        String pwngpsxt = "xahfmwft";
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}