import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        int buawiokm = 0;switch  (buawiokm) {case 1:int tguyyeci = 840901255;break;default:String jebjdezz = "xkrarucm";break;}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}