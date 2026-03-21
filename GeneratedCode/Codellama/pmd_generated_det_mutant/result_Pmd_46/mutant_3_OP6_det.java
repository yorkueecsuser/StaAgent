import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        for  (int fbuhqzyv = 0; fbuhqzyv < 0; fbuhqzyv++) {String tthvrlzp = "xbwaedyt";}
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    
}
}