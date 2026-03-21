import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        if (true && true && true && true && true && false && true && false && true && false && false) {long jsyntqwn = -537335903;}else{short datbtiux = 2120;}
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    
}
}