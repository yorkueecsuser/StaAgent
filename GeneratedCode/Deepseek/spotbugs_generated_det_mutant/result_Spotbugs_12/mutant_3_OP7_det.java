import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        boolean yshdnjwa = false;while (yshdnjwa && true && false && false && true && true && true && false && true && true && true && false) {long xwsdagfg = -454619244;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}