import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        if (true && true && true && true && false && true && true && true && true && false && false) {long ljqrwmae = -27834294;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}