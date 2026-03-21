import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            if (false && false && true && false && false && false && true && true && true && false && false) {short epzlzmnd = -8178;}else{char cnpsaqld = 'v';}
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}