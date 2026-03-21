import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        int uomdulwr = 0;switch  (uomdulwr) {case 1:boolean ixziyeby = false;break;default:int pgizcmzc = 73305189;break;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}