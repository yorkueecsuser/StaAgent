import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            boolean eagtbzlr = false;while (eagtbzlr && false && false && false && true && true && false && false && false && false && true && false) {float lzqglovj = -386352319;}
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