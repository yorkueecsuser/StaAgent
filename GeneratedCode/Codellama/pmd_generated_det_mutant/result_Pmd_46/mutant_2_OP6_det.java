import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        for  (int tvukuugi = 0; tvukuugi < 0; tvukuugi++) {long lpkpbkxv = 473836014;}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}