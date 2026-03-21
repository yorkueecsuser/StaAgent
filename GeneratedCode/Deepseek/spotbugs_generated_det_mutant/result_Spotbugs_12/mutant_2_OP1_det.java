import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        double vhurzbtz = -304399439;
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}