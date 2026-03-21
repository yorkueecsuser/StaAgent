import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        boolean drxgeyzt = false;while (drxgeyzt && false && true && false && false && false && false && true && false && true && false && false) {long ovudayfl = 981278938;}
        try {
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