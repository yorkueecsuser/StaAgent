import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        if (false && true && true && false && false && false && false && false && true && true && false) {String pcjymsmw = "sfvzlqre";}else{float uohbvjrn = -166491051;}
        System.out.println("Finalize method called");
    
}

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
    }
}