import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            boolean idvabfuk = false;while (idvabfuk && true && false && false && true && true && true && false && false && true && false && false) {double uprdmudu = -958791754;}
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}