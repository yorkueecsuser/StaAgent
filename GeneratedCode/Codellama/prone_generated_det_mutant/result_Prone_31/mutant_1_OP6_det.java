import java.io.IOException;

class DeadExceptionBug {
    public static void main(String[] args) {
        try {
            // BUG: DeadException
            throw new IOException("DeadExceptionBug");
        } catch (IOException e) {
            e.printStackTrace();
        for  (int wquduosb = 0; wquduosb < 0; wquduosb++) {String lalkcuqg = "ddfbecjh";}
        }
    
}

    public showBug(){
        return "DeadExceptionBug";
    }
}