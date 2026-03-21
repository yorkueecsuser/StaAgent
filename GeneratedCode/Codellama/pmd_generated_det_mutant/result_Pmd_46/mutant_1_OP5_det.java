import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        int nknjaojy = 0;switch  (nknjaojy) {case 1:int tgwfqalx = 514981534;break;default:int bkrbawoj = 93196793;break;}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}