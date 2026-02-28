import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
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