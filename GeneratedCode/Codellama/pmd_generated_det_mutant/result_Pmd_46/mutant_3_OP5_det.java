import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        int hfrrvkdc = 0;switch  (hfrrvkdc) {case 1:String piwgxcnt = "hoxmrmpa";break;default:short aaxfazrh = 9773;break;}
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    
}
}