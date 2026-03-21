import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        if (false && false && true && true && false && false && true && true && false && false && false) {int eoywnecs = 173180889;}else{double iqsauvpw = 29993664;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}