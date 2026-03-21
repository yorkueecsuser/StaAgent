import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        if (true && true && false && false && true && true && true && true && false && true && false) {double viwltxju = 201285131;}
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}