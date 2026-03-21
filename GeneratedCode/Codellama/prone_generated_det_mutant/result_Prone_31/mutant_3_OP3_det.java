import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            if (true && true && true && false && true && false && false && false && false && true && false) {double rblemnnu = 799564091;}
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}