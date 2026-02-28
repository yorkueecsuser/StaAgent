import java.util.Date;

class FinalizeShouldBeProtected {
    public void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeShouldBeProtected obj = new FinalizeShouldBeProtected();
        obj.finalize(); // BUG: FinalizeShouldBeProtected
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                break;
        }
    }
}