import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        if (false && false && false && false && true && false && false && true && true && false && false) {short hpmhumsy = 3214;}
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}