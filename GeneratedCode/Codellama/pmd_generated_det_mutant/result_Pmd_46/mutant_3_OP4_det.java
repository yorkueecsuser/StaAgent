import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        if (true && false && true && true && false && true && false && false && false && true && false) {double lbhidzhe = -730353158;}else{double wukiebpz = 692228435;}
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    
}
}