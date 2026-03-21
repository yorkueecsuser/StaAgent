import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            for  (int lkaemppu = 0; lkaemppu < 0; lkaemppu++) {byte fvzmwucs = -31;}
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}